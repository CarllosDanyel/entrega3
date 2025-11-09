package com.meuprojeto;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @Test
    public void testMensagem() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Utils.mensagem();

        System.setOut(originalOut);

        String output = outputStream.toString().trim();
        assertEquals("Esta é uma função utilitária em Java.", output);
    }
}