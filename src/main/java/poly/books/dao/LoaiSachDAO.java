/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.util.List;
import poly.books.entity.LoaiSach;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class LoaiSachDAO {
    String getAllSQL = """
                       SELECT TOP (1000) [MaLoaiSach]
                             ,[TenLoaiSach]
                         FROM [QLNhaSachPro].[dbo].[LoaiSach]
                       """;
    String findBySQL = """
                       SELECT * FROM [QLNhaSachPro].[dbo].[LoaiSach] where MaLoaiSach = ?
                       """;
    public List<LoaiSach> getAll() {       
        return XQuery.getBeanList(LoaiSach.class, getAllSQL);
    }
    
    public LoaiSach findByID(String MaLoaiSach) {
        return XQuery.getSingleBean(LoaiSach.class, findBySQL, MaLoaiSach);
    }
}
