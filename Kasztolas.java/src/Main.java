//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);

        byte bite = 98;
        short rovid = 3000;
        int a = 340;
        long hosszu = 25000000000L;
        float repul=4.32f;
        double dupla=2.5;
        char karakter='a';
        boolean igaze=true;
        String str="valami";
        IO.println("byte: " + bite);
        IO.println("short: " + rovid);
        IO.println("int: " + a);
        IO.println("long: " + hosszu);
        IO.println("float: " + repul);
        IO.println("double: " +dupla );
        IO.println("char: " + karakter);
        IO.println("boolean: " + igaze);
        IO.println("string: " + str);

        float dup=(float)dupla;
        IO.println("1: " + dup);
        long dupa=(long)dup;
        IO.println("2: " + dupa);
        int dupb=(int)dupa;
        IO.println("3: " + dupb);
        char dupc =(char)dupb;
        IO.println("4: " + dupc);
        short dupd=(short) dupc;
        IO.println("5: " + dupd);
        byte dupe=(byte) dupd;
        IO.println("6: " + dupe);
        long rep=(long)hosszu;
        IO.println("7: " + rep);
        int repa=(int)rep;
        IO.println("8: " + repa);
        char repb=(char) repa;
        IO.println("9: " + repb);
        short repc=(short)repb;
        IO.println("10: " + repc);
        byte repd=(byte) repc;
        IO.println("11: " + repd);
        int hosz=(int)hosszu;
        IO.println("12: " + hosz);
        char hosza=(char)hosz;
        IO.println("13: " + hosza);
        short hoszb=(short) hosza;
        IO.println("14: " + hoszb);
        byte hoszc=(byte)hoszb;
        IO.println("15: " + hoszc);
        char teg=(char)a;
        IO.println("16: " + teg);
        short tega=(short) teg;
        IO.println("17: " + tega);
        byte tegb=(byte) tega;
        IO.println("18: " + tegb);
        short kar=(short)karakter;
        IO.println("19: " + kar);
        byte kara=(byte) kar;
        IO.println("20: " + kara);
        byte rov=(byte) rovid;
        IO.println("21: " + rov);
    }
}
