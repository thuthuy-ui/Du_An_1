/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import poly.books.entity.HoaDon;
import poly.books.util.XQuery;

/**
 *
 * @author LAPTOP
 */
public class HoaDonDAO {
    String getAllSQL = """
                       
                       """;
    
    public List<HoaDon> getAll() {
        
        return XQuery.getBeanList(HoaDon.class, getAllSQL);
        
    }
}
