package CustomUtils;

import java.io.ByteArrayOutputStream;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.firstpitch.firstpitch.POJO.BookDetails;

public class TypeConverter {
	private List<BookDetails> booksList;
	
	public TypeConverter(List<BookDetails> booksList) {
		this.booksList = booksList;
	}
	
	public String booksListToString() {
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
	    final ObjectMapper mapper = new ObjectMapper();
	    try {
			mapper.writeValue(out, booksList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    final byte[] data = out.toByteArray();
	    return new String(data);
	}

}
