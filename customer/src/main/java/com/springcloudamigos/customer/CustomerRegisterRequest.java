package com.springcloudamigos.customer;

public record CustomerRegisterRequest(String firstName,
                                      String lastName,
                                      String email) {
}
