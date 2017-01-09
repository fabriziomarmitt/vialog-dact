package co.bergamota.business.objects;


import org.apache.solr.client.solrj.beans.Field;

public class Publicacao {
    private String id;
    private String cteProcCTeInfCteIdeCUF;
    private String cteProcCTeInfCteIdeCCT;
    private String cteProcCTeInfCteIdeCFOP;
    private String cteProcCTeInfCteIdeNatOp;
    private String cteProcCTeInfCteIdeForPag;
    private String cteProcCTeInfCteIdeMod;
    private String cteProcCTeInfCteIdeSerie;
    private String cteProcCTeInfCteIdeNCT;
    private String cteProcCTeInfCteIdeDhEmi;
    private String cteProcCTeInfCteIdeTpImp;
    private String cteProcCTeInfCteIdeTpEmis;
    private String cteProcCTeInfCteIdeCDV;
    private String cteProcCTeInfCteIdeTpAmb;
    private String cteProcCTeInfCteIdeTpCTe;
    private String cteProcCTeInfCteIdeProcEmi;
    private String cteProcCTeInfCteIdeVerProc;
    private String cteProcCTeInfCteIdeCMunEnv;
    private String cteProcCTeInfCteIdeXMunEnv;
    private String cteProcCTeInfCteIdeUFEnv;
    private String cteProcCTeInfCteIdeModal;
    private String cteProcCTeInfCteIdeTpServ;
    private String cteProcCTeInfCteIdeCMunIni;
    private String cteProcCTeInfCteIdeXMunIni;
    private String cteProcCTeInfCteIdeUFIni;
    private String cteProcCTeInfCteIdeCMunFim;
    private String cteProcCTeInfCteIdeXMunFim;
    private String cteProcCTeInfCteIdeUFFim;
    private String cteProcCTeInfCteIdeRetira;
    private String cteProcCTeInfCteIdeToma03Toma;


    private String cteProcCTeInfCteComplObsCont1;
    private String cteProcCTeInfCteComplObsCont2;
    private String cteProcCTeInfCteComplObsCont3;
    private String cteProcCTeInfCteComplObsCont4;


    private String cteProcCTeInfCteEmitCNPJ;
    private String cteProcCTeInfCteEmitIE;
    private String cteProcCTeInfCteEmitXNome;
    private String cteProcCTeInfCteEmitEnderEmitXLgr;
    private String cteProcCTeInfCteEmitEnderEmitNro;
    private String cteProcCTeInfCteEmitEnderEmitXBairro;
    private String cteProcCTeInfCteEmitEnderEmitCMun;
    private String cteProcCTeInfCteEmitEnderEmitXMun;
    private String cteProcCTeInfCteEmitEnderEmitCEP;
    private String cteProcCTeInfCteEmitEnderEmitUF;
    private String cteProcCTeInfCteEmitEnderEmitFone;
    private String cteProcCTeInfCteRemCNPJ;
    private String cteProcCTeInfCteRemIE;
    private String cteProcCTeInfCteRemXNome;
    private String cteProcCTeInfCteRemFone;
    private String cteProcCTeInfCteRemEnderRemeXLgr;
    private String cteProcCTeInfCteRemEnderRemeNro;
    private String cteProcCTeInfCteRemEnderRemeXCpl;
    private String cteProcCTeInfCteRemEnderRemeXBairro;
    private String cteProcCTeInfCteRemEnderRemeCMun;
    private String cteProcCTeInfCteRemEnderRemeXMun;
    private String cteProcCTeInfCteRemEnderRemeCEP;
    private String cteProcCTeInfCteRemEnderRemeUF;
    private String cteProcCTeInfCteRemEnderRemeCPais;
    private String cteProcCTeInfCteRemEnderRemeXPais;
    private String cteProcCTeInfCteExpedCNPJ;
    private String cteProcCTeInfCteExpedIE;
    private String cteProcCTeInfCteExpedXNome;
    private String cteProcCTeInfCteExpedFone;
    private String cteProcCTeInfCteExpedEnderExpedXLgr;
    private String cteProcCTeInfCteExpedEnderExpedNro;
    private String cteProcCTeInfCteExpedEnderExpedXCpl;
    private String cteProcCTeInfCteExpedEnderExpedXBairro;
    private String cteProcCTeInfCteExpedEnderExpedCMun;
    private String cteProcCTeInfCteExpedEnderExpedXMun;
    private String cteProcCTeInfCteExpedEnderExpedCEP;
    private String cteProcCTeInfCteExpedEnderExpedUF;
    private String cteProcCTeInfCteExpedEnderExpedCPais;
    private String cteProcCTeInfCteExpedEnderExpedXPais;
    private String cteProcCTeInfCteRecebCNPJ;
    private String cteProcCTeInfCteRecebCPF;
    private String cteProcCTeInfCteRecebIE;
    private String cteProcCTeInfCteRecebXNome;
    private String cteProcCTeInfCteRecebFone;
    private String cteProcCTeInfCteRecebEnderRecebXLgr;
    private String cteProcCTeInfCteRecebEnderRecebNro;
    private String cteProcCTeInfCteRecebEnderRecebXCpl;
    private String cteProcCTeInfCteRecebEnderRecebXBairro;
    private String cteProcCTeInfCteRecebEnderRecebCMun;
    private String cteProcCTeInfCteRecebEnderRecebXMun;
    private String cteProcCTeInfCteRecebEnderRecebCEP;
    private String cteProcCTeInfCteRecebEnderRecebUF;
    private String cteProcCTeInfCteRecebEnderRecebCPais;
    private String cteProcCTeInfCteRecebEnderRecebXPais;
    private String cteProcCTeInfCteDestCNPJ;
    private String cteProcCTeInfCteDestCPF;
    private String cteProcCTeInfCteDestIE;
    private String cteProcCTeInfCteDestXNome;
    private String cteProcCTeInfCteDestFone;
    private String cteProcCTeInfCteDestEnderDestXLgr;
    private String cteProcCTeInfCteDestEnderDestNro;
    private String cteProcCTeInfCteDestEnderDestXCpl;
    private String cteProcCTeInfCteDestEnderDestXBairro;
    private String cteProcCTeInfCteDestEnderDestCMun;
    private String cteProcCTeInfCteDestEnderDestXMun;
    private String cteProcCTeInfCteDestEnderDestCEP;
    private String cteProcCTeInfCteDestEnderDestUF;
    private String cteProcCTeInfCteDestEnderDestCPais;
    private String cteProcCTeInfCteDestEnderDestXPais;
    private String cteProcCTeInfCteVPrestVTPrest;
    private String cteProcCTeInfCteVPrestVRec;
    private String cteProcCTeInfCteVPrestCompXNome;
    private String cteProcCTeInfCteVPrestCompVComp;
    private String cteProcCTeInfCteImpICMSICMS00CST;
    private String cteProcCTeInfCteImpICMSICMS00VBC;
    private String cteProcCTeInfCteImpICMSICMS00PICMS;
    private String cteProcCTeInfCteImpICMSICMS00VICMS;
    private String cteProcCTeInfCteImpVTotTrib;
    private String cteProcCTeInfCteInfCTeNormInfCargaVCarga;
    private String cteProcCTeInfCteInfCTeNormInfCargaProPred;
    private String cteProcCTeInfCteInfCTeNormInfCargaInfQCUnid;
    private String cteProcCTeInfCteInfCTeNormInfCargaInfQTpMed;
    private String cteProcCTeInfCteInfCTeNormInfCargaInfQQCarga;
    private String cteProcCTeInfCteInfCTeNormInfDocInfNFeChave;
    private String cteProcCTeInfCteInfCTeNormSegRespSeg;
    private String cteProcCTeInfCteInfCTeNormSegVCarga;
    private String cteProcCTeInfCteInfCTeNormInfModalRodoRNTRC;
    private String cteProcCTeInfCteInfCTeNormInfModalRodoDPrev;
    private String cteProcCTeInfCteInfCTeNormInfModalRodoLota;
    private String cteProcProtCTeInfProtTpAmb;
    private String cteProcProtCTeInfProtVerAplic;
    private String cteProcProtCTeInfProtChCTe;
    private String cteProcProtCTeInfProtDhRecbto;
    private String cteProcProtCTeInfProtNProt;
    private String cteProcProtCTeInfProtDigVal;
    private String cteProcProtCTeInfProtCStat;

    public String getId() {
        return id;
    }

    public String getCteProcCTeInfCteIdeCUF() {
        return cteProcCTeInfCteIdeCUF;
    }

    public String getCteProcCTeInfCteIdeCCT() {
        return cteProcCTeInfCteIdeCCT;
    }

    public String getCteProcCTeInfCteIdeCFOP() {
        return cteProcCTeInfCteIdeCFOP;
    }

    public String getCteProcCTeInfCteIdeNatOp() {
        return cteProcCTeInfCteIdeNatOp;
    }

    public String getCteProcCTeInfCteIdeForPag() {
        return cteProcCTeInfCteIdeForPag;
    }

    public String getCteProcCTeInfCteIdeMod() {
        return cteProcCTeInfCteIdeMod;
    }

    public String getCteProcCTeInfCteIdeSerie() {
        return cteProcCTeInfCteIdeSerie;
    }

    public String getCteProcCTeInfCteIdeNCT() {
        return cteProcCTeInfCteIdeNCT;
    }

    public String getCteProcCTeInfCteIdeDhEmi() {
        return cteProcCTeInfCteIdeDhEmi;
    }

    public String getCteProcCTeInfCteIdeTpImp() {
        return cteProcCTeInfCteIdeTpImp;
    }

    public String getCteProcCTeInfCteIdeTpEmis() {
        return cteProcCTeInfCteIdeTpEmis;
    }

    public String getCteProcCTeInfCteIdeCDV() {
        return cteProcCTeInfCteIdeCDV;
    }

    public String getCteProcCTeInfCteIdeTpAmb() {
        return cteProcCTeInfCteIdeTpAmb;
    }

    public String getCteProcCTeInfCteIdeTpCTe() {
        return cteProcCTeInfCteIdeTpCTe;
    }

    public String getCteProcCTeInfCteIdeProcEmi() {
        return cteProcCTeInfCteIdeProcEmi;
    }

    public String getCteProcCTeInfCteIdeVerProc() {
        return cteProcCTeInfCteIdeVerProc;
    }

    public String getCteProcCTeInfCteIdeCMunEnv() {
        return cteProcCTeInfCteIdeCMunEnv;
    }

    public String getCteProcCTeInfCteIdeXMunEnv() {
        return cteProcCTeInfCteIdeXMunEnv;
    }

    public String getCteProcCTeInfCteIdeUFEnv() {
        return cteProcCTeInfCteIdeUFEnv;
    }

    public String getCteProcCTeInfCteIdeModal() {
        return cteProcCTeInfCteIdeModal;
    }

    public String getCteProcCTeInfCteIdeTpServ() {
        return cteProcCTeInfCteIdeTpServ;
    }

    public String getCteProcCTeInfCteIdeCMunIni() {
        return cteProcCTeInfCteIdeCMunIni;
    }

    public String getCteProcCTeInfCteIdeXMunIni() {
        return cteProcCTeInfCteIdeXMunIni;
    }

    public String getCteProcCTeInfCteIdeUFIni() {
        return cteProcCTeInfCteIdeUFIni;
    }

    public String getCteProcCTeInfCteIdeCMunFim() {
        return cteProcCTeInfCteIdeCMunFim;
    }

    public String getCteProcCTeInfCteIdeXMunFim() {
        return cteProcCTeInfCteIdeXMunFim;
    }

    public String getCteProcCTeInfCteIdeUFFim() {
        return cteProcCTeInfCteIdeUFFim;
    }

    public String getCteProcCTeInfCteIdeRetira() {
        return cteProcCTeInfCteIdeRetira;
    }

    public String getCteProcCTeInfCteIdeToma03Toma() {
        return cteProcCTeInfCteIdeToma03Toma;
    }

    public String getCteProcCTeInfCteEmitCNPJ() {
        return cteProcCTeInfCteEmitCNPJ;
    }

    public String getCteProcCTeInfCteEmitIE() {
        return cteProcCTeInfCteEmitIE;
    }

    public String getCteProcCTeInfCteEmitXNome() {
        return cteProcCTeInfCteEmitXNome;
    }

    public String getCteProcCTeInfCteEmitEnderEmitXLgr() {
        return cteProcCTeInfCteEmitEnderEmitXLgr;
    }

    public String getCteProcCTeInfCteEmitEnderEmitNro() {
        return cteProcCTeInfCteEmitEnderEmitNro;
    }

    public String getCteProcCTeInfCteEmitEnderEmitXBairro() {
        return cteProcCTeInfCteEmitEnderEmitXBairro;
    }

    public String getCteProcCTeInfCteEmitEnderEmitCMun() {
        return cteProcCTeInfCteEmitEnderEmitCMun;
    }

    public String getCteProcCTeInfCteEmitEnderEmitXMun() {
        return cteProcCTeInfCteEmitEnderEmitXMun;
    }

    public String getCteProcCTeInfCteEmitEnderEmitCEP() {
        return cteProcCTeInfCteEmitEnderEmitCEP;
    }

    public String getCteProcCTeInfCteEmitEnderEmitUF() {
        return cteProcCTeInfCteEmitEnderEmitUF;
    }

    public String getCteProcCTeInfCteEmitEnderEmitFone() {
        return cteProcCTeInfCteEmitEnderEmitFone;
    }

    public String getCteProcCTeInfCteRemCNPJ() {
        return cteProcCTeInfCteRemCNPJ;
    }

    public String getCteProcCTeInfCteRemIE() {
        return cteProcCTeInfCteRemIE;
    }

    public String getCteProcCTeInfCteRemXNome() {
        return cteProcCTeInfCteRemXNome;
    }

    public String getCteProcCTeInfCteRemFone() {
        return cteProcCTeInfCteRemFone;
    }

    public String getCteProcCTeInfCteRemEnderRemeXLgr() {
        return cteProcCTeInfCteRemEnderRemeXLgr;
    }

    public String getCteProcCTeInfCteRemEnderRemeNro() {
        return cteProcCTeInfCteRemEnderRemeNro;
    }

    public String getCteProcCTeInfCteRemEnderRemeXCpl() {
        return cteProcCTeInfCteRemEnderRemeXCpl;
    }

    public String getCteProcCTeInfCteRemEnderRemeXBairro() {
        return cteProcCTeInfCteRemEnderRemeXBairro;
    }

    public String getCteProcCTeInfCteRemEnderRemeCMun() {
        return cteProcCTeInfCteRemEnderRemeCMun;
    }

    public String getCteProcCTeInfCteRemEnderRemeXMun() {
        return cteProcCTeInfCteRemEnderRemeXMun;
    }

    public String getCteProcCTeInfCteRemEnderRemeCEP() {
        return cteProcCTeInfCteRemEnderRemeCEP;
    }

    public String getCteProcCTeInfCteRemEnderRemeUF() {
        return cteProcCTeInfCteRemEnderRemeUF;
    }

    public String getCteProcCTeInfCteRemEnderRemeCPais() {
        return cteProcCTeInfCteRemEnderRemeCPais;
    }

    public String getCteProcCTeInfCteRemEnderRemeXPais() {
        return cteProcCTeInfCteRemEnderRemeXPais;
    }

    public String getCteProcCTeInfCteExpedCNPJ() {
        return cteProcCTeInfCteExpedCNPJ;
    }

    public String getCteProcCTeInfCteExpedIE() {
        return cteProcCTeInfCteExpedIE;
    }

    public String getCteProcCTeInfCteExpedXNome() {
        return cteProcCTeInfCteExpedXNome;
    }

    public String getCteProcCTeInfCteExpedFone() {
        return cteProcCTeInfCteExpedFone;
    }

    public String getCteProcCTeInfCteExpedEnderExpedXLgr() {
        return cteProcCTeInfCteExpedEnderExpedXLgr;
    }

    public String getCteProcCTeInfCteExpedEnderExpedNro() {
        return cteProcCTeInfCteExpedEnderExpedNro;
    }

    public String getCteProcCTeInfCteExpedEnderExpedXCpl() {
        return cteProcCTeInfCteExpedEnderExpedXCpl;
    }

    public String getCteProcCTeInfCteExpedEnderExpedXBairro() {
        return cteProcCTeInfCteExpedEnderExpedXBairro;
    }

    public String getCteProcCTeInfCteExpedEnderExpedCMun() {
        return cteProcCTeInfCteExpedEnderExpedCMun;
    }

    public String getCteProcCTeInfCteExpedEnderExpedXMun() {
        return cteProcCTeInfCteExpedEnderExpedXMun;
    }

    public String getCteProcCTeInfCteExpedEnderExpedCEP() {
        return cteProcCTeInfCteExpedEnderExpedCEP;
    }

    public String getCteProcCTeInfCteExpedEnderExpedUF() {
        return cteProcCTeInfCteExpedEnderExpedUF;
    }

    public String getCteProcCTeInfCteExpedEnderExpedCPais() {
        return cteProcCTeInfCteExpedEnderExpedCPais;
    }

    public String getCteProcCTeInfCteExpedEnderExpedXPais() {
        return cteProcCTeInfCteExpedEnderExpedXPais;
    }

    public String getCteProcCTeInfCteRecebCPF() {
        return cteProcCTeInfCteRecebCPF;
    }

    public String getCteProcCTeInfCteRecebIE() {
        return cteProcCTeInfCteRecebIE;
    }

    public String getCteProcCTeInfCteRecebXNome() {
        return cteProcCTeInfCteRecebXNome;
    }

    public String getCteProcCTeInfCteRecebFone() {
        return cteProcCTeInfCteRecebFone;
    }

    public String getCteProcCTeInfCteRecebEnderRecebXLgr() {
        return cteProcCTeInfCteRecebEnderRecebXLgr;
    }

    public String getCteProcCTeInfCteRecebEnderRecebNro() {
        return cteProcCTeInfCteRecebEnderRecebNro;
    }

    public String getCteProcCTeInfCteRecebEnderRecebXCpl() {
        return cteProcCTeInfCteRecebEnderRecebXCpl;
    }

    public String getCteProcCTeInfCteRecebEnderRecebXBairro() {
        return cteProcCTeInfCteRecebEnderRecebXBairro;
    }

    public String getCteProcCTeInfCteRecebEnderRecebCMun() {
        return cteProcCTeInfCteRecebEnderRecebCMun;
    }

    public String getCteProcCTeInfCteRecebEnderRecebXMun() {
        return cteProcCTeInfCteRecebEnderRecebXMun;
    }

    public String getCteProcCTeInfCteRecebEnderRecebCEP() {
        return cteProcCTeInfCteRecebEnderRecebCEP;
    }

    public String getCteProcCTeInfCteRecebEnderRecebUF() {
        return cteProcCTeInfCteRecebEnderRecebUF;
    }

    public String getCteProcCTeInfCteRecebEnderRecebCPais() {
        return cteProcCTeInfCteRecebEnderRecebCPais;
    }

    public String getCteProcCTeInfCteRecebEnderRecebXPais() {
        return cteProcCTeInfCteRecebEnderRecebXPais;
    }

    public String getCteProcCTeInfCteDestCPF() {
        return cteProcCTeInfCteDestCPF;
    }

    public String getCteProcCTeInfCteRecebCNPJ() {
        return cteProcCTeInfCteRecebCNPJ;
    }

    public String getCteProcCTeInfCteDestCNPJ() {
        return cteProcCTeInfCteDestCNPJ;
    }

    public String getCteProcCTeInfCteDestIE() {
        return cteProcCTeInfCteDestIE;
    }

    public String getCteProcCTeInfCteDestXNome() {
        return cteProcCTeInfCteDestXNome;
    }

    public String getCteProcCTeInfCteDestFone() {
        return cteProcCTeInfCteDestFone;
    }

    public String getCteProcCTeInfCteDestEnderDestXLgr() {
        return cteProcCTeInfCteDestEnderDestXLgr;
    }

    public String getCteProcCTeInfCteDestEnderDestNro() {
        return cteProcCTeInfCteDestEnderDestNro;
    }

    public String getCteProcCTeInfCteDestEnderDestXCpl() {
        return cteProcCTeInfCteDestEnderDestXCpl;
    }

    public String getCteProcCTeInfCteDestEnderDestXBairro() {
        return cteProcCTeInfCteDestEnderDestXBairro;
    }

    public String getCteProcCTeInfCteDestEnderDestCMun() {
        return cteProcCTeInfCteDestEnderDestCMun;
    }

    public String getCteProcCTeInfCteDestEnderDestXMun() {
        return cteProcCTeInfCteDestEnderDestXMun;
    }

    public String getCteProcCTeInfCteDestEnderDestCEP() {
        return cteProcCTeInfCteDestEnderDestCEP;
    }

    public String getCteProcCTeInfCteDestEnderDestUF() {
        return cteProcCTeInfCteDestEnderDestUF;
    }

    public String getCteProcCTeInfCteDestEnderDestCPais() {
        return cteProcCTeInfCteDestEnderDestCPais;
    }

    public String getCteProcCTeInfCteDestEnderDestXPais() {
        return cteProcCTeInfCteDestEnderDestXPais;
    }

    public String getCteProcCTeInfCteVPrestVTPrest() {
        return cteProcCTeInfCteVPrestVTPrest;
    }

    public String getCteProcCTeInfCteVPrestVRec() {
        return cteProcCTeInfCteVPrestVRec;
    }

    public String getCteProcCTeInfCteVPrestCompXNome() {
        return cteProcCTeInfCteVPrestCompXNome;
    }

    public String getCteProcCTeInfCteVPrestCompVComp() {
        return cteProcCTeInfCteVPrestCompVComp;
    }

    public String getCteProcCTeInfCteImpICMSICMS00CST() {
        return cteProcCTeInfCteImpICMSICMS00CST;
    }

    public String getCteProcCTeInfCteImpICMSICMS00VBC() {
        return cteProcCTeInfCteImpICMSICMS00VBC;
    }

    public String getCteProcCTeInfCteImpICMSICMS00PICMS() {
        return cteProcCTeInfCteImpICMSICMS00PICMS;
    }

    public String getCteProcCTeInfCteImpICMSICMS00VICMS() {
        return cteProcCTeInfCteImpICMSICMS00VICMS;
    }

    public String getCteProcCTeInfCteImpVTotTrib() {
        return cteProcCTeInfCteImpVTotTrib;
    }

    public String getCteProcCTeInfCteInfCTeNormInfCargaVCarga() {
        return cteProcCTeInfCteInfCTeNormInfCargaVCarga;
    }

    public String getCteProcCTeInfCteInfCTeNormInfCargaProPred() {
        return cteProcCTeInfCteInfCTeNormInfCargaProPred;
    }

    public String getCteProcCTeInfCteInfCTeNormInfCargaInfQCUnid() {
        return cteProcCTeInfCteInfCTeNormInfCargaInfQCUnid;
    }

    public String getCteProcCTeInfCteInfCTeNormInfCargaInfQTpMed() {
        return cteProcCTeInfCteInfCTeNormInfCargaInfQTpMed;
    }

    public String getCteProcCTeInfCteInfCTeNormInfCargaInfQQCarga() {
        return cteProcCTeInfCteInfCTeNormInfCargaInfQQCarga;
    }

    public String getCteProcCTeInfCteInfCTeNormInfDocInfNFeChave() {
        return cteProcCTeInfCteInfCTeNormInfDocInfNFeChave;
    }

    public String getCteProcCTeInfCteInfCTeNormSegRespSeg() {
        return cteProcCTeInfCteInfCTeNormSegRespSeg;
    }

    public String getCteProcCTeInfCteInfCTeNormSegVCarga() {
        return cteProcCTeInfCteInfCTeNormSegVCarga;
    }

    public String getCteProcCTeInfCteInfCTeNormInfModalRodoRNTRC() {
        return cteProcCTeInfCteInfCTeNormInfModalRodoRNTRC;
    }

    public String getCteProcCTeInfCteInfCTeNormInfModalRodoDPrev() {
        return cteProcCTeInfCteInfCTeNormInfModalRodoDPrev;
    }

    public String getCteProcCTeInfCteInfCTeNormInfModalRodoLota() {
        return cteProcCTeInfCteInfCTeNormInfModalRodoLota;
    }

    public String getCteProcProtCTeInfProtTpAmb() {
        return cteProcProtCTeInfProtTpAmb;
    }

    public String getCteProcProtCTeInfProtVerAplic() {
        return cteProcProtCTeInfProtVerAplic;
    }

    public String getCteProcProtCTeInfProtChCTe() {
        return cteProcProtCTeInfProtChCTe;
    }

    public String getCteProcProtCTeInfProtDhRecbto() {
        return cteProcProtCTeInfProtDhRecbto;
    }

    public String getCteProcProtCTeInfProtNProt() {
        return cteProcProtCTeInfProtNProt;
    }

    public String getCteProcProtCTeInfProtDigVal() {
        return cteProcProtCTeInfProtDigVal;
    }

    public String getCteProcProtCTeInfProtCStat() {
        return cteProcProtCTeInfProtCStat;
    }

    public String getCteProcProtCTeInfProtXMotivo() {
        return cteProcProtCTeInfProtXMotivo;
    }

    private String cteProcProtCTeInfProtXMotivo;

    @Field("id")
    public void setId(String id){
        this.id = id;
    }
    @Field("cteProc_CTe_infCte_ide_cUF_s")
    public void setCteProcCTeInfCteIdeCUF(String cteProcCTeInfCteIdeCUF){
        this.cteProcCTeInfCteIdeCUF = cteProcCTeInfCteIdeCUF;
    }
    @Field("cteProc_CTe_infCte_ide_cCT_s")
    public void setCteProcCTeInfCteIdeCCT(String cteProcCTeInfCteIdeCCT){
        this.cteProcCTeInfCteIdeCCT = cteProcCTeInfCteIdeCCT;
    }
    @Field("cteProc_CTe_infCte_ide_CFOP_s")
    public void setCteProcCTeInfCteIdeCFOP(String cteProcCTeInfCteIdeCFOP){
        this.cteProcCTeInfCteIdeCFOP = cteProcCTeInfCteIdeCFOP;
    }
    @Field("cteProc_CTe_infCte_ide_natOp_s")
    public void setCteProcCTeInfCteIdeNatOp(String cteProcCTeInfCteIdeNatOp){
        this.cteProcCTeInfCteIdeNatOp = cteProcCTeInfCteIdeNatOp;
    }
    @Field("cteProc_CTe_infCte_ide_forPag_s")
    public void setCteProcCTeInfCteIdeForPag(String cteProcCTeInfCteIdeForPag){
        this.cteProcCTeInfCteIdeForPag = cteProcCTeInfCteIdeForPag;
    }
    @Field("cteProc_CTe_infCte_ide_mod_s")
    public void setCteProcCTeInfCteIdeMod(String cteProcCTeInfCteIdeMod){
        this.cteProcCTeInfCteIdeMod = cteProcCTeInfCteIdeMod;
    }
    @Field("cteProc_CTe_infCte_ide_serie_s")
    public void setCteProcCTeInfCteIdeSerie(String cteProcCTeInfCteIdeSerie){
        this.cteProcCTeInfCteIdeSerie = cteProcCTeInfCteIdeSerie;
    }
    @Field("cteProc_CTe_infCte_ide_nCT_s")
    public void setCteProcCTeInfCteIdeNCT(String cteProcCTeInfCteIdeNCT){
        this.cteProcCTeInfCteIdeNCT = cteProcCTeInfCteIdeNCT;
    }
    @Field("cteProc_CTe_infCte_ide_dhEmi_s")
    public void setCteProcCTeInfCteIdeDhEmi(String cteProcCTeInfCteIdeDhEmi){
        this.cteProcCTeInfCteIdeDhEmi = cteProcCTeInfCteIdeDhEmi;
    }
    @Field("cteProc_CTe_infCte_ide_tpImp_s")
    public void setCteProcCTeInfCteIdeTpImp(String cteProcCTeInfCteIdeTpImp){
        this.cteProcCTeInfCteIdeTpImp = cteProcCTeInfCteIdeTpImp;
    }
    @Field("cteProc_CTe_infCte_ide_tpEmis_s")
    public void setCteProcCTeInfCteIdeTpEmis(String cteProcCTeInfCteIdeTpEmis){
        this.cteProcCTeInfCteIdeTpEmis = cteProcCTeInfCteIdeTpEmis;
    }
    @Field("cteProc_CTe_infCte_ide_cDV_s")
    public void setCteProcCTeInfCteIdeCDV(String cteProcCTeInfCteIdeCDV){
        this.cteProcCTeInfCteIdeCDV = cteProcCTeInfCteIdeCDV;
    }
    @Field("cteProc_CTe_infCte_ide_tpAmb_s")
    public void setCteProcCTeInfCteIdeTpAmb(String cteProcCTeInfCteIdeTpAmb){
        this.cteProcCTeInfCteIdeTpAmb = cteProcCTeInfCteIdeTpAmb;
    }
    @Field("cteProc_CTe_infCte_ide_tpCTe_s")
    public void setCteProcCTeInfCteIdeTpCTe(String cteProcCTeInfCteIdeTpCTe){
        this.cteProcCTeInfCteIdeTpCTe = cteProcCTeInfCteIdeTpCTe;
    }
    @Field("cteProc_CTe_infCte_ide_procEmi_s")
    public void setCteProcCTeInfCteIdeProcEmi(String cteProcCTeInfCteIdeProcEmi){
        this.cteProcCTeInfCteIdeProcEmi = cteProcCTeInfCteIdeProcEmi;
    }
    @Field("cteProc_CTe_infCte_ide_verProc_s")
    public void setCteProcCTeInfCteIdeVerProc(String cteProcCTeInfCteIdeVerProc){
        this.cteProcCTeInfCteIdeVerProc = cteProcCTeInfCteIdeVerProc;
    }
    @Field("cteProc_CTe_infCte_ide_cMunEnv_s")
    public void setCteProcCTeInfCteIdeCMunEnv(String cteProcCTeInfCteIdeCMunEnv){
        this.cteProcCTeInfCteIdeCMunEnv = cteProcCTeInfCteIdeCMunEnv;
    }
    @Field("cteProc_CTe_infCte_ide_xMunEnv_s")
    public void setCteProcCTeInfCteIdeXMunEnv(String cteProcCTeInfCteIdeXMunEnv){
        this.cteProcCTeInfCteIdeXMunEnv = cteProcCTeInfCteIdeXMunEnv;
    }
    @Field("cteProc_CTe_infCte_ide_UFEnv_s")
    public void setCteProcCTeInfCteIdeUFEnv(String cteProcCTeInfCteIdeUFEnv){
        this.cteProcCTeInfCteIdeUFEnv = cteProcCTeInfCteIdeUFEnv;
    }
    @Field("cteProc_CTe_infCte_ide_modal_s")
    public void setCteProcCTeInfCteIdeModal(String cteProcCTeInfCteIdeModal){
        this.cteProcCTeInfCteIdeModal = cteProcCTeInfCteIdeModal;
    }
    @Field("cteProc_CTe_infCte_ide_tpServ_s")
    public void setCteProcCTeInfCteIdeTpServ(String cteProcCTeInfCteIdeTpServ){
        this.cteProcCTeInfCteIdeTpServ = cteProcCTeInfCteIdeTpServ;
    }
    @Field("cteProc_CTe_infCte_ide_cMunIni_s")
    public void setCteProcCTeInfCteIdeCMunIni(String cteProcCTeInfCteIdeCMunIni){
        this.cteProcCTeInfCteIdeCMunIni = cteProcCTeInfCteIdeCMunIni;
    }
    @Field("cteProc_CTe_infCte_ide_xMunIni_s")
    public void setCteProcCTeInfCteIdeXMunIni(String cteProcCTeInfCteIdeXMunIni){
        this.cteProcCTeInfCteIdeXMunIni = cteProcCTeInfCteIdeXMunIni;
    }
    @Field("cteProc_CTe_infCte_ide_UFIni_s")
    public void setCteProcCTeInfCteIdeUFIni(String cteProcCTeInfCteIdeUFIni){
        this.cteProcCTeInfCteIdeUFIni = cteProcCTeInfCteIdeUFIni;
    }
    @Field("cteProc_CTe_infCte_ide_cMunFim_s")
    public void setCteProcCTeInfCteIdeCMunFim(String cteProcCTeInfCteIdeCMunFim){
        this.cteProcCTeInfCteIdeCMunFim = cteProcCTeInfCteIdeCMunFim;
    }
    @Field("cteProc_CTe_infCte_ide_xMunFim_s")
    public void setCteProcCTeInfCteIdeXMunFim(String cteProcCTeInfCteIdeXMunFim){
        this.cteProcCTeInfCteIdeXMunFim = cteProcCTeInfCteIdeXMunFim;
    }
    @Field("cteProc_CTe_infCte_ide_UFFim_s")
    public void setCteProcCTeInfCteIdeUFFim(String cteProcCTeInfCteIdeUFFim){
        this.cteProcCTeInfCteIdeUFFim = cteProcCTeInfCteIdeUFFim;
    }
    @Field("cteProc_CTe_infCte_ide_retira_s")
    public void setCteProcCTeInfCteIdeRetira(String cteProcCTeInfCteIdeRetira){
        this.cteProcCTeInfCteIdeRetira = cteProcCTeInfCteIdeRetira;
    }
    @Field("cteProc_CTe_infCte_ide_toma03_toma_s")
    public void setCteProcCTeInfCteIdeToma03Toma(String cteProcCTeInfCteIdeToma03Toma){
        this.cteProcCTeInfCteIdeToma03Toma = cteProcCTeInfCteIdeToma03Toma;
    }

    public String getCteProcCTeInfCteComplObsCont1() {
        return cteProcCTeInfCteComplObsCont1;
    }

    @Field("cteProc_CTe_infCte_compl_ObsCont_1_s")
    public void setCteProcCTeInfCteComplObsCont1(String cteProcCTeInfCteComplObsCont1) {
        this.cteProcCTeInfCteComplObsCont1 = cteProcCTeInfCteComplObsCont1;
    }

    public String getCteProcCTeInfCteComplObsCont2() {
        return cteProcCTeInfCteComplObsCont2;
    }

    @Field("cteProc_CTe_infCte_compl_ObsCont_2_s")
    public void setCteProcCTeInfCteComplObsCont2(String cteProcCTeInfCteComplObsCont2) {
        this.cteProcCTeInfCteComplObsCont2 = cteProcCTeInfCteComplObsCont2;
    }

    public String getCteProcCTeInfCteComplObsCont3() {
        return cteProcCTeInfCteComplObsCont3;
    }

    @Field("cteProc_CTe_infCte_compl_ObsCont_3_s")
    public void setCteProcCTeInfCteComplObsCont3(String cteProcCTeInfCteComplObsCont3) {
        this.cteProcCTeInfCteComplObsCont3 = cteProcCTeInfCteComplObsCont3;
    }

    public String getCteProcCTeInfCteComplObsCont4() {
        return cteProcCTeInfCteComplObsCont4;
    }

    @Field("cteProc_CTe_infCte_compl_ObsCont_4_s")
    public void setCteProcCTeInfCteComplObsCont4(String cteProcCTeInfCteComplObsCont4) {
        this.cteProcCTeInfCteComplObsCont4 = cteProcCTeInfCteComplObsCont4;
    }

    @Field("cteProc_CTe_infCte_emit_CNPJ_s")
    public void setCteProcCTeInfCteEmitCNPJ(String cteProcCTeInfCteEmitCNPJ){
        this.cteProcCTeInfCteEmitCNPJ = cteProcCTeInfCteEmitCNPJ;
    }
    @Field("cteProc_CTe_infCte_emit_IE_s")
    public void setCteProcCTeInfCteEmitIE(String cteProcCTeInfCteEmitIE){
        this.cteProcCTeInfCteEmitIE = cteProcCTeInfCteEmitIE;
    }
    @Field("cteProc_CTe_infCte_emit_xNome_s")
    public void setCteProcCTeInfCteEmitXNome(String cteProcCTeInfCteEmitXNome){
        this.cteProcCTeInfCteEmitXNome = cteProcCTeInfCteEmitXNome;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_xLgr_s")
    public void setCteProcCTeInfCteEmitEnderEmitXLgr(String cteProcCTeInfCteEmitEnderEmitXLgr){
        this.cteProcCTeInfCteEmitEnderEmitXLgr = cteProcCTeInfCteEmitEnderEmitXLgr;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_nro_s")
    public void setCteProcCTeInfCteEmitEnderEmitNro(String cteProcCTeInfCteEmitEnderEmitNro){
        this.cteProcCTeInfCteEmitEnderEmitNro = cteProcCTeInfCteEmitEnderEmitNro;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_xBairro_s")
    public void setCteProcCTeInfCteEmitEnderEmitXBairro(String cteProcCTeInfCteEmitEnderEmitXBairro){
        this.cteProcCTeInfCteEmitEnderEmitXBairro = cteProcCTeInfCteEmitEnderEmitXBairro;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_cMun_s")
    public void setCteProcCTeInfCteEmitEnderEmitCMun(String cteProcCTeInfCteEmitEnderEmitCMun){
        this.cteProcCTeInfCteEmitEnderEmitCMun = cteProcCTeInfCteEmitEnderEmitCMun;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_xMun_s")
    public void setCteProcCTeInfCteEmitEnderEmitXMun(String cteProcCTeInfCteEmitEnderEmitXMun){
        this.cteProcCTeInfCteEmitEnderEmitXMun = cteProcCTeInfCteEmitEnderEmitXMun;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_CEP_s")
    public void setCteProcCTeInfCteEmitEnderEmitCEP(String cteProcCTeInfCteEmitEnderEmitCEP){
        this.cteProcCTeInfCteEmitEnderEmitCEP = cteProcCTeInfCteEmitEnderEmitCEP;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_UF_s")
    public void setCteProcCTeInfCteEmitEnderEmitUF(String cteProcCTeInfCteEmitEnderEmitUF){
        this.cteProcCTeInfCteEmitEnderEmitUF = cteProcCTeInfCteEmitEnderEmitUF;
    }
    @Field("cteProc_CTe_infCte_emit_enderEmit_fone_s")
    public void setCteProcCTeInfCteEmitEnderEmitFone(String cteProcCTeInfCteEmitEnderEmitFone){
        this.cteProcCTeInfCteEmitEnderEmitFone = cteProcCTeInfCteEmitEnderEmitFone;
    }
    @Field("cteProc_CTe_infCte_rem_CNPJ_s")
    public void setCteProcCTeInfCteRemCNPJ(String cteProcCTeInfCteRemCNPJ){
        this.cteProcCTeInfCteRemCNPJ = cteProcCTeInfCteRemCNPJ;
    }
    @Field("cteProc_CTe_infCte_rem_IE_s")
    public void setCteProcCTeInfCteRemIE(String cteProcCTeInfCteRemIE){
        this.cteProcCTeInfCteRemIE = cteProcCTeInfCteRemIE;
    }
    @Field("cteProc_CTe_infCte_rem_xNome_s")
    public void setCteProcCTeInfCteRemXNome(String cteProcCTeInfCteRemXNome){
        this.cteProcCTeInfCteRemXNome = cteProcCTeInfCteRemXNome;
    }
    @Field("cteProc_CTe_infCte_rem_fone_s")
    public void setCteProcCTeInfCteRemFone(String cteProcCTeInfCteRemFone){
        this.cteProcCTeInfCteRemFone = cteProcCTeInfCteRemFone;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_xLgr_s")
    public void setCteProcCTeInfCteRemEnderRemeXLgr(String cteProcCTeInfCteRemEnderRemeXLgr){
        this.cteProcCTeInfCteRemEnderRemeXLgr = cteProcCTeInfCteRemEnderRemeXLgr;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_nro_s")
    public void setCteProcCTeInfCteRemEnderRemeNro(String cteProcCTeInfCteRemEnderRemeNro){
        this.cteProcCTeInfCteRemEnderRemeNro = cteProcCTeInfCteRemEnderRemeNro;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_xCpl_s")
    public void setCteProcCTeInfCteRemEnderRemeXCpl(String cteProcCTeInfCteRemEnderRemeXCpl){
        this.cteProcCTeInfCteRemEnderRemeXCpl = cteProcCTeInfCteRemEnderRemeXCpl;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_xBairro_s")
    public void setCteProcCTeInfCteRemEnderRemeXBairro(String cteProcCTeInfCteRemEnderRemeXBairro){
        this.cteProcCTeInfCteRemEnderRemeXBairro = cteProcCTeInfCteRemEnderRemeXBairro;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_cMun_s")
    public void setCteProcCTeInfCteRemEnderRemeCMun(String cteProcCTeInfCteRemEnderRemeCMun){
        this.cteProcCTeInfCteRemEnderRemeCMun = cteProcCTeInfCteRemEnderRemeCMun;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_xMun_s")
    public void setCteProcCTeInfCteRemEnderRemeXMun(String cteProcCTeInfCteRemEnderRemeXMun){
        this.cteProcCTeInfCteRemEnderRemeXMun = cteProcCTeInfCteRemEnderRemeXMun;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_CEP_s")
    public void setCteProcCTeInfCteRemEnderRemeCEP(String cteProcCTeInfCteRemEnderRemeCEP){
        this.cteProcCTeInfCteRemEnderRemeCEP = cteProcCTeInfCteRemEnderRemeCEP;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_UF_s")
    public void setCteProcCTeInfCteRemEnderRemeUF(String cteProcCTeInfCteRemEnderRemeUF){
        this.cteProcCTeInfCteRemEnderRemeUF = cteProcCTeInfCteRemEnderRemeUF;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_cPais_s")
    public void setCteProcCTeInfCteRemEnderRemeCPais(String cteProcCTeInfCteRemEnderRemeCPais){
        this.cteProcCTeInfCteRemEnderRemeCPais = cteProcCTeInfCteRemEnderRemeCPais;
    }
    @Field("cteProc_CTe_infCte_rem_enderReme_xPais_s")
    public void setCteProcCTeInfCteRemEnderRemeXPais(String cteProcCTeInfCteRemEnderRemeXPais){
        this.cteProcCTeInfCteRemEnderRemeXPais = cteProcCTeInfCteRemEnderRemeXPais;
    }
    @Field("cteProc_CTe_infCte_exped_CNPJ_s")
    public void setCteProcCTeInfCteExpedCNPJ(String cteProcCTeInfCteExpedCNPJ){
        this.cteProcCTeInfCteExpedCNPJ = cteProcCTeInfCteExpedCNPJ;
    }
    @Field("cteProc_CTe_infCte_exped_IE_s")
    public void setCteProcCTeInfCteExpedIE(String cteProcCTeInfCteExpedIE){
        this.cteProcCTeInfCteExpedIE = cteProcCTeInfCteExpedIE;
    }
    @Field("cteProc_CTe_infCte_exped_xNome_s")
    public void setCteProcCTeInfCteExpedXNome(String cteProcCTeInfCteExpedXNome){
        this.cteProcCTeInfCteExpedXNome = cteProcCTeInfCteExpedXNome;
    }
    @Field("cteProc_CTe_infCte_exped_fone_s")
    public void setCteProcCTeInfCteExpedFone(String cteProcCTeInfCteExpedFone){
        this.cteProcCTeInfCteExpedFone = cteProcCTeInfCteExpedFone;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_xLgr_s")
    public void setCteProcCTeInfCteExpedEnderExpedXLgr(String cteProcCTeInfCteExpedEnderExpedXLgr){
        this.cteProcCTeInfCteExpedEnderExpedXLgr = cteProcCTeInfCteExpedEnderExpedXLgr;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_nro_s")
    public void setCteProcCTeInfCteExpedEnderExpedNro(String cteProcCTeInfCteExpedEnderExpedNro){
        this.cteProcCTeInfCteExpedEnderExpedNro = cteProcCTeInfCteExpedEnderExpedNro;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_xCpl_s")
    public void setCteProcCTeInfCteExpedEnderExpedXCpl(String cteProcCTeInfCteExpedEnderExpedXCpl){
        this.cteProcCTeInfCteExpedEnderExpedXCpl = cteProcCTeInfCteExpedEnderExpedXCpl;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_xBairro_s")
    public void setCteProcCTeInfCteExpedEnderExpedXBairro(String cteProcCTeInfCteExpedEnderExpedXBairro){
        this.cteProcCTeInfCteExpedEnderExpedXBairro = cteProcCTeInfCteExpedEnderExpedXBairro;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_cMun_s")
    public void setCteProcCTeInfCteExpedEnderExpedCMun(String cteProcCTeInfCteExpedEnderExpedCMun){
        this.cteProcCTeInfCteExpedEnderExpedCMun = cteProcCTeInfCteExpedEnderExpedCMun;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_xMun_s")
    public void setCteProcCTeInfCteExpedEnderExpedXMun(String cteProcCTeInfCteExpedEnderExpedXMun){
        this.cteProcCTeInfCteExpedEnderExpedXMun = cteProcCTeInfCteExpedEnderExpedXMun;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_CEP_s")
    public void setCteProcCTeInfCteExpedEnderExpedCEP(String cteProcCTeInfCteExpedEnderExpedCEP){
        this.cteProcCTeInfCteExpedEnderExpedCEP = cteProcCTeInfCteExpedEnderExpedCEP;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_UF_s")
    public void setCteProcCTeInfCteExpedEnderExpedUF(String cteProcCTeInfCteExpedEnderExpedUF){
        this.cteProcCTeInfCteExpedEnderExpedUF = cteProcCTeInfCteExpedEnderExpedUF;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_cPais_s")
    public void setCteProcCTeInfCteExpedEnderExpedCPais(String cteProcCTeInfCteExpedEnderExpedCPais){
        this.cteProcCTeInfCteExpedEnderExpedCPais = cteProcCTeInfCteExpedEnderExpedCPais;
    }
    @Field("cteProc_CTe_infCte_exped_enderExped_xPais_s")
    public void setCteProcCTeInfCteExpedEnderExpedXPais(String cteProcCTeInfCteExpedEnderExpedXPais){
        this.cteProcCTeInfCteExpedEnderExpedXPais = cteProcCTeInfCteExpedEnderExpedXPais;
    }
    @Field("cteProc_CTe_infCte_receb_CNPJ_s")
    public void setCteProcCTeInfCteRecebCNPJ(String cteProcCTeInfCteRecebCNPJ) {
        this.cteProcCTeInfCteRecebCNPJ = cteProcCTeInfCteRecebCNPJ;
    }
    @Field("cteProc_CTe_infCte_receb_CPF_s")
    public void setCteProcCTeInfCteRecebCPF(String cteProcCTeInfCteRecebCPF){
        this.cteProcCTeInfCteRecebCPF = cteProcCTeInfCteRecebCPF;
    }
    @Field("cteProc_CTe_infCte_receb_IE_s")
    public void setCteProcCTeInfCteRecebIE(String cteProcCTeInfCteRecebIE){
        this.cteProcCTeInfCteRecebIE = cteProcCTeInfCteRecebIE;
    }
    @Field("cteProc_CTe_infCte_receb_xNome_s")
    public void setCteProcCTeInfCteRecebXNome(String cteProcCTeInfCteRecebXNome){
        this.cteProcCTeInfCteRecebXNome = cteProcCTeInfCteRecebXNome;
    }
    @Field("cteProc_CTe_infCte_receb_fone_s")
    public void setCteProcCTeInfCteRecebFone(String cteProcCTeInfCteRecebFone){
        this.cteProcCTeInfCteRecebFone = cteProcCTeInfCteRecebFone;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_xLgr_s")
    public void setCteProcCTeInfCteRecebEnderRecebXLgr(String cteProcCTeInfCteRecebEnderRecebXLgr){
        this.cteProcCTeInfCteRecebEnderRecebXLgr = cteProcCTeInfCteRecebEnderRecebXLgr;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_nro_s")
    public void setCteProcCTeInfCteRecebEnderRecebNro(String cteProcCTeInfCteRecebEnderRecebNro){
        this.cteProcCTeInfCteRecebEnderRecebNro = cteProcCTeInfCteRecebEnderRecebNro;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_xCpl_s")
    public void setCteProcCTeInfCteRecebEnderRecebXCpl(String cteProcCTeInfCteRecebEnderRecebXCpl){
        this.cteProcCTeInfCteRecebEnderRecebXCpl = cteProcCTeInfCteRecebEnderRecebXCpl;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_xBairro_s")
    public void setCteProcCTeInfCteRecebEnderRecebXBairro(String cteProcCTeInfCteRecebEnderRecebXBairro){
        this.cteProcCTeInfCteRecebEnderRecebXBairro = cteProcCTeInfCteRecebEnderRecebXBairro;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_cMun_s")
    public void setCteProcCTeInfCteRecebEnderRecebCMun(String cteProcCTeInfCteRecebEnderRecebCMun){
        this.cteProcCTeInfCteRecebEnderRecebCMun = cteProcCTeInfCteRecebEnderRecebCMun;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_xMun_s")
    public void setCteProcCTeInfCteRecebEnderRecebXMun(String cteProcCTeInfCteRecebEnderRecebXMun){
        this.cteProcCTeInfCteRecebEnderRecebXMun = cteProcCTeInfCteRecebEnderRecebXMun;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_CEP_s")
    public void setCteProcCTeInfCteRecebEnderRecebCEP(String cteProcCTeInfCteRecebEnderRecebCEP){
        this.cteProcCTeInfCteRecebEnderRecebCEP = cteProcCTeInfCteRecebEnderRecebCEP;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_UF_s")
    public void setCteProcCTeInfCteRecebEnderRecebUF(String cteProcCTeInfCteRecebEnderRecebUF){
        this.cteProcCTeInfCteRecebEnderRecebUF = cteProcCTeInfCteRecebEnderRecebUF;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_cPais_s")
    public void setCteProcCTeInfCteRecebEnderRecebCPais(String cteProcCTeInfCteRecebEnderRecebCPais){
        this.cteProcCTeInfCteRecebEnderRecebCPais = cteProcCTeInfCteRecebEnderRecebCPais;
    }
    @Field("cteProc_CTe_infCte_receb_enderReceb_xPais_s")
    public void setCteProcCTeInfCteRecebEnderRecebXPais(String cteProcCTeInfCteRecebEnderRecebXPais){
        this.cteProcCTeInfCteRecebEnderRecebXPais = cteProcCTeInfCteRecebEnderRecebXPais;
    }

    @Field("cteProc_CTe_infCte_dest_CNPJ_s")
    public void setCteProcCTeInfCteDestCNPJ(String cteProcCTeInfCteDestCNPJ) {
        this.cteProcCTeInfCteDestCNPJ = cteProcCTeInfCteDestCNPJ;
    }

    @Field("cteProc_CTe_infCte_dest_CPF_s")
    public void setCteProcCTeInfCteDestCPF(String cteProcCTeInfCteDestCPF){
        this.cteProcCTeInfCteDestCPF = cteProcCTeInfCteDestCPF;
    }
    @Field("cteProc_CTe_infCte_dest_IE_s")
    public void setCteProcCTeInfCteDestIE(String cteProcCTeInfCteDestIE){
        this.cteProcCTeInfCteDestIE = cteProcCTeInfCteDestIE;
    }
    @Field("cteProc_CTe_infCte_dest_xNome_s")
    public void setCteProcCTeInfCteDestXNome(String cteProcCTeInfCteDestXNome){
        this.cteProcCTeInfCteDestXNome = cteProcCTeInfCteDestXNome;
    }
    @Field("cteProc_CTe_infCte_dest_fone_s")
    public void setCteProcCTeInfCteDestFone(String cteProcCTeInfCteDestFone){
        this.cteProcCTeInfCteDestFone = cteProcCTeInfCteDestFone;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_xLgr_s")
    public void setCteProcCTeInfCteDestEnderDestXLgr(String cteProcCTeInfCteDestEnderDestXLgr){
        this.cteProcCTeInfCteDestEnderDestXLgr = cteProcCTeInfCteDestEnderDestXLgr;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_nro_s")
    public void setCteProcCTeInfCteDestEnderDestNro(String cteProcCTeInfCteDestEnderDestNro){
        this.cteProcCTeInfCteDestEnderDestNro = cteProcCTeInfCteDestEnderDestNro;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_xCpl_s")
    public void setCteProcCTeInfCteDestEnderDestXCpl(String cteProcCTeInfCteDestEnderDestXCpl){
        this.cteProcCTeInfCteDestEnderDestXCpl = cteProcCTeInfCteDestEnderDestXCpl;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_xBairro_s")
    public void setCteProcCTeInfCteDestEnderDestXBairro(String cteProcCTeInfCteDestEnderDestXBairro){
        this.cteProcCTeInfCteDestEnderDestXBairro = cteProcCTeInfCteDestEnderDestXBairro;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_cMun_s")
    public void setCteProcCTeInfCteDestEnderDestCMun(String cteProcCTeInfCteDestEnderDestCMun){
        this.cteProcCTeInfCteDestEnderDestCMun = cteProcCTeInfCteDestEnderDestCMun;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_xMun_s")
    public void setCteProcCTeInfCteDestEnderDestXMun(String cteProcCTeInfCteDestEnderDestXMun){
        this.cteProcCTeInfCteDestEnderDestXMun = cteProcCTeInfCteDestEnderDestXMun;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_CEP_s")
    public void setCteProcCTeInfCteDestEnderDestCEP(String cteProcCTeInfCteDestEnderDestCEP){
        this.cteProcCTeInfCteDestEnderDestCEP = cteProcCTeInfCteDestEnderDestCEP;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_UF_s")
    public void setCteProcCTeInfCteDestEnderDestUF(String cteProcCTeInfCteDestEnderDestUF){
        this.cteProcCTeInfCteDestEnderDestUF = cteProcCTeInfCteDestEnderDestUF;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_cPais_s")
    public void setCteProcCTeInfCteDestEnderDestCPais(String cteProcCTeInfCteDestEnderDestCPais){
        this.cteProcCTeInfCteDestEnderDestCPais = cteProcCTeInfCteDestEnderDestCPais;
    }
    @Field("cteProc_CTe_infCte_dest_enderDest_xPais_s")
    public void setCteProcCTeInfCteDestEnderDestXPais(String cteProcCTeInfCteDestEnderDestXPais){
        this.cteProcCTeInfCteDestEnderDestXPais = cteProcCTeInfCteDestEnderDestXPais;
    }
    @Field("cteProc_CTe_infCte_vPrest_vTPrest_s")
    public void setCteProcCTeInfCteVPrestVTPrest(String cteProcCTeInfCteVPrestVTPrest){
        this.cteProcCTeInfCteVPrestVTPrest = cteProcCTeInfCteVPrestVTPrest;
    }
    @Field("cteProc_CTe_infCte_vPrest_vRec_s")
    public void setCteProcCTeInfCteVPrestVRec(String cteProcCTeInfCteVPrestVRec){
        this.cteProcCTeInfCteVPrestVRec = cteProcCTeInfCteVPrestVRec;
    }
    @Field("cteProc_CTe_infCte_vPrest_Comp_xNome_s")
    public void setCteProcCTeInfCteVPrestCompXNome(String cteProcCTeInfCteVPrestCompXNome){
        this.cteProcCTeInfCteVPrestCompXNome = cteProcCTeInfCteVPrestCompXNome;
    }
    @Field("cteProc_CTe_infCte_vPrest_Comp_vComp_s")
    public void setCteProcCTeInfCteVPrestCompVComp(String cteProcCTeInfCteVPrestCompVComp){
        this.cteProcCTeInfCteVPrestCompVComp = cteProcCTeInfCteVPrestCompVComp;
    }
    @Field("cteProc_CTe_infCte_imp_ICMS_ICMS00_CST_s")
    public void setCteProcCTeInfCteImpICMSICMS00CST(String cteProcCTeInfCteImpICMSICMS00CST){
        this.cteProcCTeInfCteImpICMSICMS00CST = cteProcCTeInfCteImpICMSICMS00CST;
    }
    @Field("cteProc_CTe_infCte_imp_ICMS_ICMS00_vBC_s")
    public void setCteProcCTeInfCteImpICMSICMS00VBC(String cteProcCTeInfCteImpICMSICMS00VBC){
        this.cteProcCTeInfCteImpICMSICMS00VBC = cteProcCTeInfCteImpICMSICMS00VBC;
    }
    @Field("cteProc_CTe_infCte_imp_ICMS_ICMS00_pICMS_s")
    public void setCteProcCTeInfCteImpICMSICMS00PICMS(String cteProcCTeInfCteImpICMSICMS00PICMS){
        this.cteProcCTeInfCteImpICMSICMS00PICMS = cteProcCTeInfCteImpICMSICMS00PICMS;
    }
    @Field("cteProc_CTe_infCte_imp_ICMS_ICMS00_vICMS_s")
    public void setCteProcCTeInfCteImpICMSICMS00VICMS(String cteProcCTeInfCteImpICMSICMS00VICMS){
        this.cteProcCTeInfCteImpICMSICMS00VICMS = cteProcCTeInfCteImpICMSICMS00VICMS;
    }
    @Field("cteProc_CTe_infCte_imp_vTotTrib_s")
    public void setCteProcCTeInfCteImpVTotTrib(String cteProcCTeInfCteImpVTotTrib){
        this.cteProcCTeInfCteImpVTotTrib = cteProcCTeInfCteImpVTotTrib;
    }
    @Field("cteProc_CTe_infCte_infCTeNorm_infCarga_vCarga_s")
    public void setCteProcCTeInfCteInfCTeNormInfCargaVCarga(String cteProcCTeInfCteInfCTeNormInfCargaVCarga){
        this.cteProcCTeInfCteInfCTeNormInfCargaVCarga = cteProcCTeInfCteInfCTeNormInfCargaVCarga;
    }
    
    @Field("cteProc_CTe_infCte_infCTeNorm_infCarga_proPred_s")
    public void setCteProcCTeInfCteInfCTeNormInfCargaProPred(String cteProcCTeInfCteInfCTeNormInfCargaProPred){
        this.cteProcCTeInfCteInfCTeNormInfCargaProPred = cteProcCTeInfCteInfCTeNormInfCargaProPred;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_infCarga_infQ_cUnid_s")
    public void setCteProcCTeInfCteInfCTeNormInfCargaInfQCUnid(String cteProcCTeInfCteInfCTeNormInfCargaInfQCUnid){
        this.cteProcCTeInfCteInfCTeNormInfCargaInfQCUnid = cteProcCTeInfCteInfCTeNormInfCargaInfQCUnid;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_infCarga_infQ_tpMed_s")
    public void setCteProcCTeInfCteInfCTeNormInfCargaInfQTpMed(String cteProcCTeInfCteInfCTeNormInfCargaInfQTpMed){
        this.cteProcCTeInfCteInfCTeNormInfCargaInfQTpMed = cteProcCTeInfCteInfCTeNormInfCargaInfQTpMed;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_infCarga_infQ_qCarga_s")
    public void setCteProcCTeInfCteInfCTeNormInfCargaInfQQCarga(String cteProcCTeInfCteInfCTeNormInfCargaInfQQCarga){
        this.cteProcCTeInfCteInfCTeNormInfCargaInfQQCarga = cteProcCTeInfCteInfCTeNormInfCargaInfQQCarga;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_infDoc_infNFe_chave_s")
    public void setCteProcCTeInfCteInfCTeNormInfDocInfNFeChave(String cteProcCTeInfCteInfCTeNormInfDocInfNFeChave){
        this.cteProcCTeInfCteInfCTeNormInfDocInfNFeChave = cteProcCTeInfCteInfCTeNormInfDocInfNFeChave;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_seg_respSeg_s")
    public void setCteProcCTeInfCteInfCTeNormSegRespSeg(String cteProcCTeInfCteInfCTeNormSegRespSeg){
        this.cteProcCTeInfCteInfCTeNormSegRespSeg = cteProcCTeInfCteInfCTeNormSegRespSeg;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_seg_vCarga_s")
    public void setCteProcCTeInfCteInfCTeNormSegVCarga(String cteProcCTeInfCteInfCTeNormSegVCarga){
        this.cteProcCTeInfCteInfCTeNormSegVCarga = cteProcCTeInfCteInfCTeNormSegVCarga;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_infModal_rodo_RNTRC_s")
    public void setCteProcCTeInfCteInfCTeNormInfModalRodoRNTRC(String cteProcCTeInfCteInfCTeNormInfModalRodoRNTRC){
        this.cteProcCTeInfCteInfCTeNormInfModalRodoRNTRC = cteProcCTeInfCteInfCTeNormInfModalRodoRNTRC;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_infModal_rodo_dPrev_s")
    public void setCteProcCTeInfCteInfCTeNormInfModalRodoDPrev(String cteProcCTeInfCteInfCTeNormInfModalRodoDPrev){
        this.cteProcCTeInfCteInfCTeNormInfModalRodoDPrev = cteProcCTeInfCteInfCTeNormInfModalRodoDPrev;
    }

    @Field("cteProc_CTe_infCte_infCTeNorm_infModal_rodo_lota_s")
    public void setCteProcCTeInfCteInfCTeNormInfModalRodoLota(String cteProcCTeInfCteInfCTeNormInfModalRodoLota){
        this.cteProcCTeInfCteInfCTeNormInfModalRodoLota = cteProcCTeInfCteInfCTeNormInfModalRodoLota;
    }

    @Field("cteProc_protCTe_infProt_tpAmb_s")
    public void setCteProcProtCTeInfProtTpAmb(String cteProcProtCTeInfProtTpAmb){
        this.cteProcProtCTeInfProtTpAmb = cteProcProtCTeInfProtTpAmb;
    }

    @Field("cteProc_protCTe_infProt_verAplic_s")
    public void setCteProcProtCTeInfProtVerAplic(String cteProcProtCTeInfProtVerAplic){
        this.cteProcProtCTeInfProtVerAplic = cteProcProtCTeInfProtVerAplic;
    }

    @Field("cteProc_protCTe_infProt_chCTe_s")
    public void setCteProcProtCTeInfProtChCTe(String cteProcProtCTeInfProtChCTe){
        this.cteProcProtCTeInfProtChCTe = cteProcProtCTeInfProtChCTe;
    }

    @Field("cteProc_protCTe_infProt_dhRecbto_s")
    public void setCteProcProtCTeInfProtDhRecbto(String cteProcProtCTeInfProtDhRecbto){
        this.cteProcProtCTeInfProtDhRecbto = cteProcProtCTeInfProtDhRecbto;
    }

    @Field("cteProc_protCTe_infProt_nProt_s")
    public void setCteProcProtCTeInfProtNProt(String cteProcProtCTeInfProtNProt){
        this.cteProcProtCTeInfProtNProt = cteProcProtCTeInfProtNProt;
    }

    @Field("cteProc_protCTe_infProt_digVal_s")
    public void setCteProcProtCTeInfProtDigVal(String cteProcProtCTeInfProtDigVal){
        this.cteProcProtCTeInfProtDigVal = cteProcProtCTeInfProtDigVal;
    }

    @Field("cteProc_protCTe_infProt_cStat_s")
    public void setCteProcProtCTeInfProtCStat(String cteProcProtCTeInfProtCStat){
        this.cteProcProtCTeInfProtCStat = cteProcProtCTeInfProtCStat;
    }

    @Field("cteProc_protCTe_infProt_xMotivo_s")
    public void setCteProcProtCTeInfProtXMotivo(String cteProcProtCTeInfProtXMotivo){
        this.cteProcProtCTeInfProtXMotivo = cteProcProtCTeInfProtXMotivo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Publicacao that = (Publicacao) obj;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}