package org.program;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HourDate5 {




    public static void main(String[] args) {
            try {
                // Formato para parse das datas
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

                // Data que você quer verificar
                Date dataParaVerificar = formato.parse("2025-01-29");

                // Período desejado
                Date inicioPeriodo = formato.parse("2025-01-01");
                Date fimPeriodo = formato.parse("2025-12-31");

                // Verificando se a data está dentro do período
                if (!dataParaVerificar.before(inicioPeriodo) && !dataParaVerificar.after(fimPeriodo)) {
                    System.out.println("A data está dentro do período.");
                } else {
                    System.out.println("A data está fora do período.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


