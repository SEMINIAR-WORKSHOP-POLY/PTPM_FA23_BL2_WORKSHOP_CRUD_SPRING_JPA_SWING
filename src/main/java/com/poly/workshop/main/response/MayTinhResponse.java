/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.workshop.main.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author hangnt
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MayTinhResponse {

    private Long id;

    private String maMayTinh;

    private String maHang;

    private String tenHang;

    private String tenMayTinh;

    private Float gia;

    private String boNho;

    private String mauSac;

    private String mieuTa;

}
