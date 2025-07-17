/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.books.util;

import poly.books.entity.NguoiDungSD;

/**
 *
 * @author HuyNguyen
 */
public class XAuth {
    public static NguoiDungSD user = NguoiDungSD.builder()
            .TenDangNhap("user1@gmail.com") 
            .MatKhau("123") 
            .TrangThai(true) 
            .QuanLy(true) 
            .HoTen("Nguyễn Văn Tèo") 
            .HinhAnh("user.png") 
            .build(); 
}
