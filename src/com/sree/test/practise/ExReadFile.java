package com.sree.test.practise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExReadFile {

	public static void main(String[] args) throws IOException {

		Stream<String> file = Files.lines(Paths.get("D:\\boxing.txt"));
				Map<String, Integer> collect = file.map(txt->txt.split(","))
						.filter(txt->txt.length == 3)
						.filter(x->Integer.parseInt(x[1])>15)
						.collect(Collectors.toMap(x->x[0], x->Integer.parseInt(x[1])));
						//.forEach(x->System.out.println(x[0]+" ,"+x[1]+" ,"+x[2]));
						//.count();
						//System.out.println(rowCount);
				file.close();
				for (String key : collect.keySet()) {
					System.out.println(collect.get(key));
				}
		
	}

}
