/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {
        /**
         * ************************
         *                        *
         * Abreviaciones: * * PRS = Persona * * ART = Artículo * * PRC = Precio
         * * * DIN = Dinero * * CNT = Cantidad * * ENC = Encargo * * SUMI =
         * Suministrado * * DEV = Devuelto * * CMP = Comprada * * *
         *************************
         */
        //Constantes
        final String PRS_ENC = "Jaimito";
        final String ART_ENC = "Patatas";
        final String ART_IMP = "Piruleta";

        final int CNT_ENC = 3;

        final double PRC_ENC = 0.3;
        final double PRC_IMP = 0.2;
        final double DIN_SUMI = 1;

        //Variables
        int cntCmp = (int) ((DIN_SUMI - PRC_IMP) / PRC_ENC);
        double dinDev = DIN_SUMI - cntCmp * PRC_ENC - PRC_IMP;
        //Salidas
        System.out.println("Secuencia de Patatas");
        System.out.println("=====================");

        System.out.printf("Persona encargada .....: %s%n",
                PRS_ENC);
        System.out.printf("Artículo encargado ....: %s%n",
                ART_ENC);
        System.out.printf("Cantidad encargada ....: %d kg%n",
                CNT_ENC);

        System.out.println("---");

        System.out.printf(Locale.ENGLISH,
                "Precio encargo ........: %.2f €/kg%n",
                PRC_ENC);
        System.out.printf(Locale.ENGLISH,
                "Dinero suministrado ...: %.2f €%n",
                DIN_SUMI);

        System.out.println("---");

        System.out.printf("Artículo imprevisto ...: %s%n",
                ART_IMP);
        System.out.printf(Locale.ENGLISH,
                "Precio imprevisto .....: %.2f €%n",
                PRC_IMP);

        System.out.println("---");

        System.out.printf("Cantidad comprada .....: %s kg%n",
                cntCmp);
        System.out.printf(Locale.ENGLISH,
                "Dinero devuelto .......: %.2f €%n",
                dinDev);
    }
}
