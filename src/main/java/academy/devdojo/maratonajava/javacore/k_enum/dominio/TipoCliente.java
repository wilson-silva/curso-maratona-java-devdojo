package academy.devdojo.maratonajava.javacore.k_enum.dominio;

public enum TipoCliente {
        PESSOA_FISICA(1, "Pessoa Fisica"),
        PESSOA_JURIDICA(2, "Pessoa Jurídica");

        private int valor;
        private String nomeRelatorio;

        TipoCliente(int valor, String nomeRelatorio){
                this.valor = valor;
                this.nomeRelatorio = nomeRelatorio;
        }
        
        public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
                for (TipoCliente tipoCliente : values()) {
                        if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                                return tipoCliente;
                        }
                }
                return null;

        }

        public String getNomeRelatorio() {
                return nomeRelatorio;
        }

        public int getValor() {
                return valor;
        }
}
