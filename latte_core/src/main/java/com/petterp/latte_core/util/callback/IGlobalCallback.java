package com.petterp.latte_core.util.callback;


import androidx.annotation.Nullable;

/**
 *
 * Summary:回调
 *
 */
public interface IGlobalCallback <T>{
    void executeCallback(@Nullable T args);
}
