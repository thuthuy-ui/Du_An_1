/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.util.ArrayList;
import java.util.List;
import poly.books.entity.HoaDon;
import poly.books.entity.Sach;
import poly.books.util.XJdbc;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class SachDAO {

    String getAllSQL = """
                       SELECT  [MaSach]
                             ,[TenSach]
                             ,[MaTacGia]
                             ,[MaLinhVuc]
                             ,[MaLoaiSach]
                             ,[MaNXB]
                             ,[NamXuatBan]
                             ,[GiaBan]
                             ,[LanTaiBan]
                             ,[ISBN]
                             ,[Tap]
                             ,[MaNgonNgu]
                             ,[HinhAnh]
                         FROM [QLNhaSachPro].[dbo].[Sach]
                       """;
    String createSQL = """
                       INSERT INTO [dbo].[Sach]
                                  ([TenSach]
                                  ,[MaTacGia]
                                  ,[MaLinhVuc]
                                  ,[MaLoaiSach]
                                  ,[MaNXB]
                                  ,[NamXuatBan]
                                  ,[GiaBan]
                                  ,[LanTaiBan]
                                  ,[ISBN]
                                  ,[Tap]
                                  ,[MaNgonNgu]
                                  ,[HinhAnh])
                            VALUES
                                  (?,?,?,?,?,?,?,?,?,?,?,?)
                       """;
    String updateSQL = """
                       UPDATE [dbo].[Sach]
                          SET [TenSach] = ?
                             ,[MaTacGia] = ?
                             ,[MaLinhVuc] = ?
                             ,[MaLoaiSach] = ?
                             ,[MaNXB] = ?
                             ,[NamXuatBan] = ?
                             ,[GiaBan] = ?
                             ,[LanTaiBan] = ?
                             ,[ISBN] = ?
                             ,[Tap] = ?
                             ,[MaNgonNgu] = ?
                             ,[HinhAnh] = ?
                        WHERE MaSach = ?
                       """;
    String deleteSQL = """
                       DELETE FROM [dbo].[Sach]
                             WHERE MaSach = ?
                       """;

    public List<Sach> getAll() {
        List<Sach> list=new ArrayList<>();
        return XQuery.getBeanList(Sach.class, getAllSQL);
    }

    public int create(Sach sach) {
        Object[] values = {
            sach.getTenSach(),
            sach.getMaTacGia(),
            sach.getMaLinhVuc(),
            sach.getMaLoaiSach(),
            sach.getMaNXB(),
            sach.getNamXuatBan(),
            sach.getGiaBan(),
            sach.getLanTaiBan(),
            sach.getISBN(),
            sach.getTap(),
            sach.getMaNgonNgu(),
            sach.getHinhAnh(),
        };
        return XJdbc.executeUpdate(createSQL, values);
    }
   public  int update(Sach sach) {
        Object[] values = {
            sach.getTenSach(),
            sach.getMaTacGia(),
            sach.getMaLinhVuc(),
            sach.getMaLoaiSach(),
            sach.getMaNXB(),
            sach.getNamXuatBan(),
            sach.getGiaBan(),
            sach.getLanTaiBan(),
            sach.getISBN(),
            sach.getTap(),
            sach.getMaNgonNgu(),
            sach.getHinhAnh(),
            sach.getMaSach()
        };
        return XJdbc.executeUpdate(updateSQL, values);
    }
   
   public int delete(String MaSach) {
       return XJdbc.executeUpdate(deleteSQL,MaSach);
   }
}
