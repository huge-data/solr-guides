package solr.in.action.ch15;

import org.apache.lucene.queries.function.ValueSource;
import org.apache.solr.search.FunctionQParser;
import org.apache.solr.search.SyntaxError;
import org.apache.solr.search.ValueSourceParser;

public class ConcatenateFunctionParser extends ValueSourceParser {

	/*	public void init(NamedList namedList) {
			}*/

	@Override
	public ValueSource parse(FunctionQParser fqp) throws SyntaxError {
		ValueSource value1 = fqp.parseValueSource();
		ValueSource value2 = fqp.parseValueSource();
		String delimiter = null;
		if (fqp.hasMoreArguments()) {
			delimiter = fqp.parseArg();
		}

		return new ConcatenateFunction(value1, value2, delimiter);
	}

}