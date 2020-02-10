//package eu.cefim.java;
//
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.BeanListHandler;
//import java.Sql.Connection;
//import java.sql.Connection;
//import java.util.List;
//
//public class ClientHandler extends BeanListHandler<Client> {
//    public ClientHandler(Connection connection){
//        List<Client> clients = super.handle(rs);
//        QueryRunner runner = new QueryRunner();
//        BeanListHandler<Billet> handler = new BeanListHandler<>(Billet.class);
//        String query = "SELECT * FROM billet WHERE achat_client_id = ?";
//        for (Client client : client) {
//            List<Billet> billetsAchetes = runner.query(connection, query, handler, client.getId());
//            client.setBilletsAchetes(billetsAchetes);
//        }
//        return clients;
//    }
//}
