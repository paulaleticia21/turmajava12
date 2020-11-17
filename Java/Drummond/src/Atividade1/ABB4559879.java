package Atividade1;

public class ABB4559879 {
	class No {

	    private int chave;
	    private No esq;
	    private No dir;

	    public No(int chave) {
	        this.chave = chave;
	    }

	    public int getChave() {
	        return this.chave;
	    }

	    public void setChave(int chave) {
	        this.chave = chave;
	    }

	    public No getEsq() {
	        return this.esq;
	    }

	    public void setEsq(No esq) {
	        this.esq = esq;
	    }

	    public No getDir() {
	        return this.dir;
	    }

	    public void setDir(No dir) {
	        this.dir = dir;
	    }
	}


	class ABBInsercao {

	  public  static No raiz = null;

	    public static void main(String[] args) {

	        /*
	         * 5, 2, 7, 6, 11, 9, 31
	         */

	        inserir(new No(5));
	        inserir(new No(2));
	        inserir(new No(7));
	        inserir(new No(6));
	        inserir(new No(11));
	        inserir(new No(9));
	        inserir(new No(31));

	        EmOrdem(raiz);

	        remover(raiz, 6);
	        remover(raiz,31);
	        System.out.println("--- No Removido ---");
	        EmOrdem(raiz);

	    }

	    static void inserir(No novo) {
	        if (raiz == null) {
	            raiz = novo;
	            return;
	        }

	        No anterior = null;
	        No atual = raiz;
	        while (atual != null) {
	            anterior = atual;
	            if (atual.getChave() < novo.getChave()) {
	                atual = atual.getDir();
	            } else {
	                atual = atual.getEsq();
	            }
	        }

	        if (anterior.getChave() < novo.getChave()) {
	            anterior.setDir(novo);
	        } else {
	            anterior.setEsq(novo);
	        }

	    }

	    static void EmOrdem(No raiz) {

	        if (raiz == null) {
	            return;
	        }
	        EmOrdem(raiz.getEsq());
	        System.out.println(String.format("NÓ %d", raiz.getChave()));
	        EmOrdem(raiz.getDir());
	    }

	    public static No remover(No no, int valor) {
	        if (no == null) {
	            return no;
	        }

	        if (valor < no.getChave()) {
	            no.setEsq(remover(no.getEsq(), valor));
	        } else if (valor > no.getChave()) {
	            no.setDir(remover(no.getDir(), valor));
	        } else {
	            if (no.getEsq() == null && no.getDir() == null) {
	                return null;
	            }
	        }
	        return no;
	    }
	}

}
