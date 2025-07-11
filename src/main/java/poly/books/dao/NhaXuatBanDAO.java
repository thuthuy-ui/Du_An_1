/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.util.List;
import poly.books.entity.NhaXuatBan;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class NhaXuatBanDAO {

    String getAllSQL = """
                       SELECT  [MaNXB]
                             ,[TenNXB]
                         FROM [QLNhaSachPro].[dbo].[NhaXuatBan]
                       """;
    String findBySQL = """
                       SELECT * FROM [QLNhaSachPro].[dbo].[NhaXuatBan] where MaNXB = ?
                       """;

    public List<NhaXuatBan> getAll() {
        return XQuery.getBeanList(NhaXuatBan.class, getAllSQL);
    }

    public NhaXuatBan findByID(String MaNXB) {
        return XQuery.getSingleBean(NhaXuatBan.class, findBySQL, MaNXB);
    }
}
