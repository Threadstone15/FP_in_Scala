file:///D:/UDEEPA/UCSC/2nd%20year/1st%20sem/SCS2204%20Functional%20Programming/practical/1/FP_in_Scala/Prac_1/1.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///D:/UDEEPA/UCSC/2nd%20year/1st%20sem/SCS2204%20Functional%20Programming/practical/1/FP_in_Scala/Prac_1/1.scala
text:
```scala
def Area_Disk(r:Double):Double = {
    math.Pi*r*r
}
val r = 5
val area = Area_Disk(r)

def println(s"Area of the disk with radius $r is $area")
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.parsing.Scanners$Scanner.lookahead(Scanners.scala:1087)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause$$anonfun$1(Parsers.scala:3470)
	dotty.tools.dotc.parsing.Parsers$Parser.enclosedWithCommas(Parsers.scala:601)
	dotty.tools.dotc.parsing.Parsers$Parser.inParensWithCommas(Parsers.scala:614)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause(Parsers.scala:3486)
	dotty.tools.dotc.parsing.Parsers$Parser.recur$6(Parsers.scala:3500)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClauses(Parsers.scala:3508)
	dotty.tools.dotc.parsing.Parsers$Parser.defDefOrDcl(Parsers.scala:3804)
	dotty.tools.dotc.parsing.Parsers$Parser.defOrDcl(Parsers.scala:3690)
	dotty.tools.dotc.parsing.Parsers$Parser.topStatSeq(Parsers.scala:4312)
	dotty.tools.dotc.parsing.Parsers$Parser.topstats$1(Parsers.scala:4496)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit$$anonfun$1(Parsers.scala:4501)
	dotty.tools.dotc.parsing.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:528)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit(Parsers.scala:4506)
	dotty.tools.dotc.parsing.Parsers$Parser.parse(Parsers.scala:201)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:32)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:477)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:40)
	dotty.tools.dotc.parsing.Parser.$anonfun$2(ParserPhase.scala:52)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:684)
	scala.collection.immutable.List$.from(List.scala:681)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:898)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:53)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:315)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:337)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:350)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:360)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:360)
	dotty.tools.dotc.Run.compileSources(Run.scala:261)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:47)
	dotty.tools.pc.PcCollector.<init>(PcCollector.scala:42)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:109)
```
#### Short summary: 

java.lang.AssertionError: assertion failed