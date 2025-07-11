    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package poly.books.dao;

    import java.util.List;
    import poly.books.entity.TacGia;
    import poly.books.util.XJdbc;
    import poly.books.util.XQuery;

    /**
     *
     * @author LAPTOP
     */
    public class TacGiaDAO {

        String getAllSQL = """
                           SELECT [MaTacGia]
                                 ,[TenTacGia]
                                 ,[QueQuan]
                             FROM [QLNhaSachPro].[dbo].[TacGia]
                           """;
        String findBySQL = """
                           SELECT * FROM [QLNhaSachPro].[dbo].[TacGia] where MaTacGia = ?
                           """;
        String create = """
                        INSERT INTO [dbo].[TacGia]
                                   ([TenTacGia]
                                   ,[QueQuan])
                             VALUES
                                   (?,?)
                       """;
        String update = """
                         UPDATE [dbo].[TacGia]
                            SET [TenTacGia] = ?
                               ,[QueQuan] = ?
                          WHERE MaTacGia = ?
                       """;
        String delete = """
                        DELETE FROM [dbo].[TacGia]
                              WHERE MaTacGia = ?
                       """;

        public List<TacGia> getAll() {
            return XQuery.getBeanList(TacGia.class, getAllSQL);
        }

        public TacGia findByID(String MaTacGia) {
            return XQuery.getSingleBean(TacGia.class, findBySQL, MaTacGia);
        }

        public int create(TacGia tacGia) {
            Object[] rowData = {
                tacGia.getTenTacGia(),
                tacGia.getQueQuan()
            };
            return XJdbc.executeUpdate(create, rowData);
        }

        public int update(TacGia tacGia) {
            Object[] rowData = {
                tacGia.getTenTacGia(),
                tacGia.getQueQuan(),
                tacGia.getMaTacGia()
            };
            return XJdbc.executeUpdate(update, rowData);
        }

        public int delete(int id) {
            return XJdbc.executeUpdate(delete, id);
        }
    }
