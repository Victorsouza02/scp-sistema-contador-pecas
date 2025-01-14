/*
CLASSE: CONFIGURACÃO GLOBAL
FUNÇÃO: CONFIGURAR VARIAVEIS DE IMG E CAMINHO DE ARQUIVOS
 */
package scp.config;

public class ConfiguracaoGlobal {
    
    //**************** CONFIGURAÇÃO VISUAL **********************
    
    //############## TELA PRINCIPAL ###############
    //ICONE DO APLICATIVO
    private static final String ICONE_IMG= "ebmico.jpg";
    //IMAGEM DO DISPLAY
    private static final String DISPLAY_PRINCIPAL_IMG = "pe-display.jpg";
    //TITULO DA TELA INICIAL
    private static final String TITULO_INICIAL = "Sistema Contador de Peças - EBM Metrologia";
    
    //############## TELA SOBRE ##############
    //IMAGEM COM A LOGO DA EMPRESA
    private static final String LOGO_EMPRESA = "logoebm.png";
    private static final String NOME_EMPRESA = "EBM";
    private static final String VERSAO = "1.01";
    private static final String TELEFONE = "(21) 2472-5858";
    private static final String SITE = "ebm.com.br";
    
    //***********************************************************
   
    // ********************** FUNÇÕES ***************************
    
    //ATIVA FUNÇÃO DE PROTEÇÃO 
    private static final boolean PROTECAO = true;

    // **********************************************************

    public static String getTITULO_INICIAL() {
        return TITULO_INICIAL;
    }

    public static String getNOME_EMPRESA() {
        return NOME_EMPRESA;
    }

    public static String getVERSAO() {
        return VERSAO;
    }

    public static String getTELEFONE() {
        return TELEFONE;
    }

    public static String getSITE() {
        return SITE;
    }

    public static String getICONE_IMG() {
        return ICONE_IMG;
    }

    public static String getDISPLAY_PRINCIPAL_IMG() {
        return DISPLAY_PRINCIPAL_IMG;
    }

    public static String getLOGO_EMPRESA() {
        return LOGO_EMPRESA;
    }

    public static boolean isPROTECAO() {
        return PROTECAO;
    }
    
    
    
    

    
    
    
    
    
    
    
    
}
