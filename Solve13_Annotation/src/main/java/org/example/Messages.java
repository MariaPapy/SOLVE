package org.example;

import java.time.LocalTime;

import static org.example.Color.*;
import static org.example.Style.*;

@Paint(style = BOLD, color = BLUE)

public class Messages {
    @Paint(style = ITALIC, color = GREEN)
    public String meow(){

        return "Кошка мяукает";
    }

    private String time(){

        return "Сейчас "+ String.valueOf(LocalTime.now());
    }
    private String sun(){

        return "--->На улице светит солнце<---";
    }
    @Paint(style = OKGREEN, color = CYAN)
    public String may(){

        return "Сегодня первый день мая";
    }
    @Paint(style = WARNING, color = YELLOW)
    private String warning(){

        return "\u26A0Ура! Наконец-то тепло!";
    }
}
