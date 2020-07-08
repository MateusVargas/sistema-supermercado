package regex;

public class validaCampos {
    public static boolean validaNome(String nome){
        return nome.matches("\\p{Alpha}[\\p{IsLatin}[ ]]+");
    }
    
    public static boolean validaCnpj(String cnpj){
        return cnpj.matches("\\p{Digit}{2}\\.\\p{Digit}{3}\\.\\p{Digit}{3}\\/\\p{Digit}{4}-\\p{Digit}{2}");
    }
    
    public static boolean validaEndereco(String endereco){
        return endereco.matches("\\p{Alnum}[\\p{IsLatin}\\p{Alnum}[ ][,-]]+");
    }
    
    public static boolean validaEmail(String mail){
        return mail.matches("([\\p{Alnum}\\._-])+@([\\p{Alnum}])+(\\.([\\p{Alnum}])+)*");
    }
    
    public static boolean validaFone(String fone){
        return fone.matches("\\(\\p{Digit}{2}\\)\\s\\p{Digit}{4,5}-\\p{Digit}{4}");
    }
    
    public static boolean validaCpf(String cpf){
        return cpf.matches("\\p{Digit}{3}\\.\\p{Digit}{3}\\.\\p{Digit}{3}-\\p{Digit}{2}");
    }
    
    public static boolean validaCep(String cep){
        return cep.matches("\\p{Digit}{5}-\\p{Digit}{3}");
    }
    
    public static boolean validaCidade(String city){
        return city.matches("\\p{Alpha}[\\p{IsLatin}[ ]]+");
    }
    
    public static boolean validaData(String data){
        return data.matches("\\p{Digit}{2}\\/\\p{Digit}{2}\\/\\p{Digit}{4}");
    }
    
    public static boolean validaDescricao(String descr){
        return descr.matches(".+");//[\\p{IsLatin}[ ]]+
    }
    
    public static boolean validaPreco(String preco){
        return preco.matches("\\p{Digit}{1,10}(\\.\\p{Digit}{1,3})?");
    }
    
    public static boolean validaPercentual(String p){
        return p.matches("\\p{Digit}{1,4}(\\.\\p{Digit}{1,3})?");
    }
    
    public static boolean validaSalario(String sal){
        return sal.matches("\\p{Digit}{1,10}(\\.\\p{Digit}{1,3})?");
    }
    
    public static boolean validaQuantidade(String qtd){
        return qtd.matches("\\p{Digit}{1,10}");
    }
    
    public static boolean validaCodigodebarras(String code){
        return code.matches("\\p{Digit}{7,15}");
    }
    
}

