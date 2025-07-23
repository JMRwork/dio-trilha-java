package poo;
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String versaoIOS;

    public iPhone(String modelo, String versaoIOS) {
        this.modelo = modelo;
        this.versaoIOS = versaoIOS;
    }

    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionada: " + musica);
    }

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    // Navegador Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
    
    public static void main(String[] args) {
    	iPhone meuIphone = new iPhone("7", "iOS 1.0");
         
    	// Testando funcionalidades
    	meuIphone.tocar();
        meuIphone.selecionarMusica("Garota de Ipanema");
        meuIphone.pausar();
            
        meuIphone.ligar("+55 (11) 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
            
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}