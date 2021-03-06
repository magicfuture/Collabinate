package com.collabinate.server;

import org.junit.Test;

import com.tinkerpop.blueprints.KeyIndexableGraph;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;

public class DefaultServerWriterTest extends CollabinateWriterTest
{
	@Override
	CollabinateWriter getWriter()
	{
		KeyIndexableGraph graph = new TinkerGraph();
		return new DefaultServer(graph);
	}
	
	@Test
	public void should_not_allow_null_graph()
	{
		exception.expect(IllegalArgumentException.class);
		new DefaultServer(null);
	}
}
