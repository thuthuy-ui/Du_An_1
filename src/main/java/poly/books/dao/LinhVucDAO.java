
package poly.books.dao;

import java.util.List;
import poly.books.entity.LinhVuc;
import poly.books.util.XQuery;

public class LinhVucDAO {
    String getAllSQL = """
                       SELECT TOP (1000) [MaLinhVuc]
                             ,[TenLinhVuc]
                         FROM [QLNhaSachPro].[dbo].[LinhVuc]
                       """;
    String findBySQL = """
                       SELECT * FROM [QLNhaSachPro].[dbo].[LinhVuc] where MaLinhVuc = ?
                       """;
    public List<LinhVuc> getAll() {
        
        return XQuery.getBeanList(LinhVuc.class, getAllSQL);
        
    }
    public LinhVuc findbyID(String maLinhVuc) {
        
        return XQuery.getSingleBean(LinhVuc.class, findBySQL, maLinhVuc);
    }
}
