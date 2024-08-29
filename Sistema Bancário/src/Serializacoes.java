import java.io.*;
import java.util.List;
import java.io.Serializable;


public class Serializacoes implements Serializable {
    //private static final long serialVersionUID = 12345;

    public static void serializeAgencias(List<Agencia> agencias) {
        try (FileOutputStream fos = new FileOutputStream("Agencias.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // Limpa o arquivo antes de escrever os novos dados
            oos.reset();
            oos.writeObject(agencias);
        } catch (IOException e) {
            System.out.println("Erro ao serializar as agencias: " + e.getMessage());
        }
    }
    public static void serializeTransacoes(Transacoes transacao){

        // Salvando o objeto em um arquivo binário
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("transacoes.bin", true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(transacao);
            objectOutputStream.close();
            fileOutputStream.close();
            //System.out.println("Transacoes salvas em arquivo binario.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}