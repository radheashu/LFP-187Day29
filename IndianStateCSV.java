package com.company;
import com.opencsv.bean.CsvBindByName;

    public class IndianStateCSV {
        @CsvBindByName(column = "SrNo", required = true)
        public int SrNo;
        @CsvBindByName(column = "State Name", required = true)
        public String state;
        @CsvBindByName(column = "TIN", required = true)
        public int TIN;
        @CsvBindByName(column = "StateCode", required = true)
        public String stateCode;

        @Override
        public String toString() {
            return "IndiaStateCSV{" +
                    "SrNo=" + SrNo +
                    ", state='" + state + '\'' +
                    ", TIN=" + TIN +
                    ", stateCode='" + stateCode + '\'' +
                    '}';
        }
    }

