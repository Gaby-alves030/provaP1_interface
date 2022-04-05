public class Principal {
    
    public static void main(String[] args) {
        
        Aluno a = new Aluno();

        a.setNome("Gabriela");
        a.setRa("1233876123");
        a.setSala("Terceiro ano");
        a.adicionar();

        System.out.println(a.getNome());
        System.out.println(a.getRa());
        System.out.println(a.getSala());
        System.out.println(a.pesquisar());
    }

}