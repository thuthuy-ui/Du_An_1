    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package poly.books.dao;

    import java.util.List;
    import poly.books.entity.HoaDon;
    import poly.books.util.XJdbc;
    import poly.books.util.XQuery;

    /**
     *
     * @author LAPTOP
     */
    public class HoaDonDAO {

          String getAllSQL = """
                           SELECT TOP (1000) [MaHD]
                                 ,[NgayLap]
                                 ,[MaKH]
                                 ,[TenDangNhap]
                                 ,[MaPhieu]
                                 ,[TongTien]
                                 ,[PhuongThuc]
                                 ,[NgayThanhToan]
                             FROM [QLNhaSachPro].[dbo].[HoaDon]
                           """;
        String createSQL = """
                           INSERT INTO [dbo].[HoaDon]
                                      ([NgayLap]
                                      ,[MaKH]
                                      ,[TenDangNhap]
                                      ,[MaPhieu]
                                      ,[TongTien]
                                      ,[PhuongThuc]
                                      ,[NgayThanhToan])
                                VALUES
                                      (?,?,?,?,?,?,?)
                           """;
        String updateSQL = """
                           UPDATE [dbo].[HoaDon]
                              SET [NgayLap] = ?
                                 ,[MaKH] = ?
                                 ,[TenDangNhap] = ?
                                 ,[MaPhieu] = ?
                                 ,[TongTien] = ?
                                 ,[PhuongThuc] = ?
                                 ,[NgayThanhToan] = ?
                            WHERE MaHD = ?
                           """;
        String deleteSQL = """
                           DELETE FROM [dbo].[HoaDon]
                                 WHERE MaHD = ?
                           """;
       public List<HoaDon> getAll() {
           return XQuery.getBeanList(HoaDon.class, getAllSQL);
       }

       public int create(HoaDon hoaDon) {
           Object[] values = {
               hoaDon.getNgayLap(),
               hoaDon.getMaKH(),
               hoaDon.getTenDangNhap(),
               hoaDon.getMaPhieu(),
               hoaDon.getTongTien(),
               hoaDon.getPhuongThuc(),
               hoaDon.getNgayThanhToan()
           };
           return XJdbc.executeUpdate(createSQL, values);
       }
       public int update(HoaDon hoaDon) {
           Object[] values = {
               hoaDon.getNgayLap(),
               hoaDon.getMaKH(),
               hoaDon.getTenDangNhap(),
               hoaDon.getMaPhieu(),
               hoaDon.getTongTien(),
               hoaDon.getPhuongThuc(),
               hoaDon.getNgayThanhToan(),
               hoaDon.getMaHD()
           };
           return XJdbc.executeUpdate(updateSQL, values);
       }

       public int delete(int MaHD) {
           return XJdbc.executeUpdate(deleteSQL, MaHD);
       }
    }
