package edu.uci.ics.crawler4j.frontier;

import com.sleepycat.bind.tuple.TupleBinding;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;

import edu.uci.ics.crawler4j.url.WebURL;

/**
 * Copyright (C) 2008
 * @author Yasser Ganjisaffar <yganjisa@uci.edu>
 */

public final class WebURLTupleBinding extends TupleBinding<WebURL> {

	@Override
	public WebURL entryToObject(TupleInput input) {
		return new WebURL(input.readString(), input.readInt());		
	}

	@Override
	public void objectToEntry(WebURL url, TupleOutput output) {		
		output.writeString(url.getURL());
		output.writeInt(url.getDocid());
	}
}