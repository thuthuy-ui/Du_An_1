/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.dao;

import java.util.List;
import poly.books.entity.NgonNgu;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class NgonNguDAO {

    String getAllSQL = """
                       SELECT TOP (1000) [MaNgonNgu]
                             ,[TenNgonNgu]
                         FROM [QLNhaSachPro].[dbo].[NgonNgu]
                       """;
    String findBySQL = """
                       SELECT * FROM [QLNhaSachPro].[dbo].[NgonNgu] where MaNgonNgu = ?
                       """;

    public List<NgonNgu> getAll() {
        return XQuery.getBeanList(NgonNgu.class, getAllSQL);
    }

    public NgonNgu findByID(String MaNgonNgu) {
        return XQuery.getSingleBean(NgonNgu.class, findBySQL, MaNgonNgu);
    }
}
