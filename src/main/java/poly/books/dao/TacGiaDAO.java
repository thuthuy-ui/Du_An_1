/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.util.List;
import poly.books.entity.TacGia;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class TacGiaDAO {

    String getAllSQL = """
                       SELECT TOP (1000) [MaTacGia]
                             ,[TenTacGia]
                             ,[QueQuan]
                         FROM [QLNhaSachPro].[dbo].[TacGia]
                       """;
    String findBySQL = """
                       SELECT * FROM [QLNhaSachPro].[dbo].[TacGia] where MaTacGia = ?
                       """;

    public List<TacGia> getAll() {
        return XQuery.getBeanList(TacGia.class, getAllSQL);
    }

    public TacGia findByID(String MaTacGia) {
        return XQuery.getSingleBean(TacGia.class, findBySQL, MaTacGia);
    }
}
