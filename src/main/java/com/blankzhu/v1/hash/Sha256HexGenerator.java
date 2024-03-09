package com.blankzhu.v1.hash;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256HexGenerator {
    static public String generate(byte[] message) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = messageDigest.digest(message);
        return Hex.encodeHexString(bytes).toLowerCase();
    }
}
