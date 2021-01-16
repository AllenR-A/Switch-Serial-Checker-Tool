package com.switchcheck;

public class EristaPatchCheck {
    /**
     * Takes in the assemblyline "X00" & number which appears after the assemblyline in the serial
     * Then uses those 2 to determine if it's patched or not.
     * @param assemblyLine Takes in the format "X00" but only reads "X"
     * @param number a 9-character String interpreted as a 9-digit int
     * @return  "Unpatched", "Maybe", "Patched", or "Korean" (for those unknown korean units)
     */
    public static String patchCheck(String assemblyLine, String number){
        int num = Integer.parseInt(number);
        if (assemblyLine.charAt(0)=='J'){
            if (assemblyLine.charAt(1)=='1'){
                if (num>=30000000)
                    return "Patched";
                else if (num>=20000000)
                    return "Maybe";
                else
                    return "Unpatched";
            }
            else if (assemblyLine.charAt(1)=='4'){
                if (num>=60000000)
                    return "Patched";
                else if (num>=46000000)
                    return "Maybe";
                else
                    return "Unpatched";
            }
            else if (assemblyLine.charAt(1)=='7'){
                if (num>=50000000)
                    return "Patched";
                else if (num>=40000000)
                    return "Maybe";
                else
                    return "Unpatched";
            }
            else if (assemblyLine.charAt(1)=='9'){
                return "Refurbished";
            }
        } else if (assemblyLine.charAt(0)=='W'){
            if (assemblyLine.charAt(1)=='1'){
                if (num>=120000000)
                    return "Patched";
                else if (num>=75000000)
                    return "Maybe";
                else
                    return "Unpatched";
            }
            else if (assemblyLine.charAt(1)=='4'){
                if (num>=12000000)
                    return "Patched";
                else if (num>=11000000)
                    return "Maybe";
                else
                    return "Unpatched";
            }
            else if (assemblyLine.charAt(1)=='7'){
                if (num>=30000000)
                    return "Patched";
                else if (num>=17500000)
                    return "Maybe";
                else
                    return "Unpatched";
            }
            else if (assemblyLine.charAt(1)=='9'){
                return "Refurbished";
            }
        } else if (assemblyLine.charAt(0)=='K'){
            return "Korean";
        }
        return "if *this* appears, something went wrong with patchCheck()";
    }
}