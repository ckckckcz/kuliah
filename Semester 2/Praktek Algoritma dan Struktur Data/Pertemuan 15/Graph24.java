public class Graph24 {
    int vertex;
    DoubleLinkedList24 list[];

    public Graph24(int v) {
        vertex = v;
        list = new DoubleLinkedList24[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList24();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < list[i].size(); j++) {
                    sb.append((char) ('A' + list[i].get(j)))
                    .append(" (")
                    .append(list[i].getJarak(j))
                    .append(" m)");
                    if (j < list[i].size() - 1) {
                        sb.append(", ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
        System.out.println("");
    }
    
}