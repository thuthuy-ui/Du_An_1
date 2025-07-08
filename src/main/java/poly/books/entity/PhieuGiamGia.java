/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.entity;

import java.util.Date;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
/**
 *
 * @author HuyNguyen
 */
public class PhieuGiamGia {
    private int MaPhieu;
    private int MaKH;
    private int GiaTri;
    private int DieuKienApDung;
    private Date NgayHetHan;
    private int TrangThai;

}
