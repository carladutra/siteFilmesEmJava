class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Esse e o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        
        System.out.println("Ano de lancamento " + ano);
        
        double media = (8.4 + 7.5 + 6.8)/3;
        System.out.println("A media das notas deste filme e: " +media);
        
        String sinopse;
        sinopse = "Filme de aventura bla bla bla bla";
        System.out.println(sinopse);
        
        //atribuindo estrelas para o filme
        int classificacao = (int) media/2;
        System.out.println(classificacao);
        
    }
}