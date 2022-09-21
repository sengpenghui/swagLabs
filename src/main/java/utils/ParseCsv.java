package utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ParseCsv {

    public List list = new ArrayList();
    public List getCsvFile(String fileName){
        try{
            Reader in = new FileReader("src\\test\\resources\\" + fileName + ".csv");
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for(CSVRecord record: records){
                list.add(record.toList());
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }



}
