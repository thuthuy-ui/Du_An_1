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
public class Sach {
    private int MaSach;
    private String TenSach;
    private int MaTacGia;
    private int MaLinhVuc;
    private int MaLoaiSach;
    private int MaNXB;
    private Date NamXuatBan;
    private double GiaBan;
    private int LanTaiBan;
    private String ISBN;
    private Integer Tap;
    private int MaNgonNgu;
    private String HinhAnh;
    private int TrangThai;
}
