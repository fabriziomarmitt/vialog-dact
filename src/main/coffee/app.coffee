
class Publicacoes
  @searchTimeout : null
  constructor : () ->
    $('.search-trigger').click () =>
      this.search $('input[name="search-value"]').val()
    $('input[name="search-value"]').on 'keyup', () =>
      if Publicacoes.searchTimeout != null
        clearTimeout Publicacoes.searchTimeout
      Publicacoes.searchTimeout = setTimeout () =>
        Publicacoes.searchTimeout = null
        this.search $('input[name="search-value"]').val()
      , 200

  getAll : () ->
    $.get '/api/publicacoes/getAll', (data) ->
      container = $('.publicacoes-container')
      container.empty()
      data.forEach (item) ->
        container.append """
          <div class="row">
              <div class="col-xs-12">
                  <h2 style="border-bottom: solid 1px;">#{item.nomepublicacao}</h2>
                  <p><b>Autores</b> #{item.pesquisadores.map (el) => el.nomepesquisador}</p>
                  <p><a class="btn btn-secondary" href="/detalhes/#{item.idpublicacao}" role="button">Detalhes &raquo;</a></p>
              </div>
          </div>
        """

  search : (search) ->
    $.get "/api/publicacoes/search", search : search, (data) ->
      container = $('.publicacoes-container')
      container.empty()
      if data.length == 0
        container.append """
            <div class="row">
                <div class="col-xs-12">
                 </div>
            </div>
          """
      else
        data.forEach (item) ->
          formatCpf = (numero) ->
            numero.replace(/^(\d{3})(\d{3})(\d{3})(\d{2})$/, "$1.$2.$3-$4")

          formatCnpj = (numero) ->
            numero.replace(/^(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})$/, "$1.$2.$3/$4-$5")

          container.append """
            <div class="row">
                <div class="col-xs-12">
                    <h1><span>CTRC (CTE)</span> #{item.id.replace("CTe","")} <span class='pull-xs-right'><a target='_blank' href='/download/xml/#{item.id.replace("CTe","")}'>XML</a> | <a target='_blank' href='/download/comprovante/#{item.id.replace("CTe","")}'>Comprovante</a></span></h1>
                    <p><span>NFe</span> #{item.cteProcCTeInfCteInfCTeNormInfDocInfNFeChave}</p>
                    <p class='compl'>
                       <span>#{item.cteProcCTeInfCteComplObsCont1 ? ''}</span>
                       <span>#{item.cteProcCTeInfCteComplObsCont2 ? ''}</span>
                       <span>#{item.cteProcCTeInfCteComplObsCont3 ? ''}</span>
                       <span>#{item.cteProcCTeInfCteComplObsCont4 ? ''}</span>
                    </p>
                    <div class='row'>
                      <div class='col-xs-6'>
                        <fieldset>
                          <legend>Destinatário</legend>
                          <p><span>CPF/CNPJ</span> #{formatCpf(item.cteProcCTeInfCteDestCPF ? '')}#{formatCnpj(item.cteProcCTeInfCteDestCNPJ ? '')}</p>
                          <p><span>IE</span> #{item.cteProcCTeInfCteDestIE ? ''}</p>
                          <p><span>Nome</span> #{item.cteProcCTeInfCteDestXNome ? ''}</p>
                          <p><span>Fone</span> #{item.cteProcCTeInfCteDestFone ? ''}</p>
                        </fieldset>
                      </div>
                      <div class='col-xs-6'>
                        <fieldset>
                          <legend>Recebimento</legend>
                          <p><span>CPF/CNPJ</span> #{formatCpf(item.cteProcCTeInfCteRecebCPF ? '')}#{formatCnpj(item.cteProcCTeInfCteRecebCNPJ ? '')}</p>
                          <p><span>IE</span> #{item.cteProcCTeInfCteRecebIE ? ''}</p>
                          <p><span>Nome</span> #{item.cteProcCTeInfCteRecebXNome ? ''}</p>
                          <p><span>Fone</span> #{item.cteProcCTeInfCteRecebFone ? ''}</p>
                        </fieldset>
                      </div>
                    </div>
                </div>
            </div>
          """

new Publicacoes().getAll()