package com.lslg.hxmall.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Enzo
 * @Date 2020/10/20 8:57
 * @Version 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HxException extends RuntimeException{

        private int code;

        private String msg;
}
