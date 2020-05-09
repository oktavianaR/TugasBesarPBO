package tebakbahasalampung;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tebakbahasalampung.Koneksi;

public class Database {

    Koneksi connec = new Koneksi();
    Statement stm;
    ResultSet rs;

    public DefaultTableModel isiTabel() {
        // query ambil data
        String getContent = "SELECT nama, skor FROM skor ORDER BY skor DESC LIMIT 10";

//        mendeklarasikan nama kolom
        Object header[] = {"Nama", "Skor"};

//        deklarasi model tabel
        DefaultTableModel TableData = new DefaultTableModel(null, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            stm = connec.getKoneksi().createStatement();

//            eksekusi query
            rs = stm.executeQuery(getContent);

            while (rs.next()) {
                String Data[] = {rs.getString(1), rs.getString(2)};
                TableData.addRow(Data);          
            }

//            menutup koneksi
            rs.close();
            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan : " + e, "Bug!", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            return TableData;
        }
    }

    public void insertTabel(String nama, int skor) {

        
        // query ambil data
        String save = "INSERT INTO `tebakbahasalampung`.`skor` (`id`, `nama`, `skor`) VALUES (NULL, '" + nama + "', '" + skor + "');";

        try {
            stm = connec.getKoneksi().createStatement();

//            eksekusi query
            stm.execute(save);

            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan : " + e, "Bug!", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
