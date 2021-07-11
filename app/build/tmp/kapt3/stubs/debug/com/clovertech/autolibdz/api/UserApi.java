package com.clovertech.autolibdz.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/clovertech/autolibdz/api/UserApi;", "", "getPointByUser", "Lretrofit2/Call;", "Lcom/clovertech/autolibdz/model/Tenant;", "idUser", "", "getUser", "Lcom/clovertech/autolibdz/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserById", "Lcom/clovertech/autolibdz/model/Profil;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/3")
    public abstract java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.clovertech.autolibdz.model.User> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/{id}")
    public abstract java.lang.Object getUserById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.clovertech.autolibdz.model.Profil> p1);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "locataires/{idUser}")
    public abstract retrofit2.Call<com.clovertech.autolibdz.model.Tenant> getPointByUser(@retrofit2.http.Path(value = "idUser")
    int idUser);
}