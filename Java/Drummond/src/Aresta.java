import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Aresta {
    private Vertice origem;
    private Vertice destino;
    private int custo;
    private String meio;

    public Aresta(Vertice origem, Vertice destino, int custo, String meio) {
        this.origem = origem;
        this.destino = destino;
        this.custo = custo;
        this.meio = meio;
    }

    public boolean temProximo() {
        if (!origem.isVisited())
            return true;
        else if (!destino.isVisited())
            return true;
        else
            return false;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getMeio() {
        return meio;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

}


class AtividadeGrafo {

    /* 	Casa = C1, carr�o= C2, Republica = C3, Onibus = C4,
        Metro republica= C5, Metro fradique = C6, Trabalho = C7
    */

    public static void main(String[] args) {
        // Gerar a classe vertice (V1 a Vn)
        Vertice c1 = new Vertice(1);
        Vertice c2 = new Vertice(2);
        Vertice c3 = new Vertice(3);
        Vertice c4 = new Vertice(4);
        Vertice c5 = new Vertice(5);
        Vertice c6 = new Vertice(6);
        Vertice c7 = new Vertice(7);


        List<Aresta> arestas = new ArrayList<Aresta>();
        arestas.add(new Aresta(c1, c2, 10, "A Pé"));
        arestas.add(new Aresta(c1, c3, 20, "A Pé"));
        arestas.add(new Aresta(c1, c4, 12, "A Pé"));

        arestas.add(new Aresta(c2, c1, 10, "A Pé"));
        arestas.add(new Aresta(c2, c3, 5, "Metrô"));

        arestas.add(new Aresta(c3, c1, 20, "A Pé"));
        arestas.add(new Aresta(c3, c2, 5, "Metrô"));
        arestas.add(new Aresta(c3, c5, 20, "Metrô"));

        arestas.add(new Aresta(c4, c1, 12, "A Pé"));
        arestas.add(new Aresta(c4, c7, 60, "Ônibus"));

        arestas.add(new Aresta(c5, c3, 20, "Metrô"));
        arestas.add(new Aresta(c5, c6, 15, "Metrô"));

        arestas.add(new Aresta(c6, c5, 15, "Metrô"));
        arestas.add(new Aresta(c6, c7, 5, "Metrô"));

        arestas.add(new Aresta(c7, c6, 5, "Metrô"));
        arestas.add(new Aresta(c7, c4, 60, "Ônibus"));

        System.out.println("Inicio BFS");
        BFS(arestas, c1);
        System.out.println("Fim processamento BFS");
    }

    static void BFS(List<Aresta> listAdjs, Vertice s) {
        LinkedList<Vertice> queue = new LinkedList<Vertice>();

        s.setVisited(true);
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println("Vertice: " + s.getCodigo());

            for (Aresta aresta : listAdjs) {
                while (aresta.temProximo()) {
                    Vertice n;
                    if (!aresta.getOrigem().isVisited())
                        n = aresta.getOrigem();
                    else
                        n = aresta.getDestino();
                    n.setVisited(true);
                    queue.add(n);
                }
            }
        }

    }

}

class Vertice {
    private int codigo;
    private boolean visited;

    public Vertice(int codigo) {
        super();
        this.codigo = codigo;
        this.visited = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}