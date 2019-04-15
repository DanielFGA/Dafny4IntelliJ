// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi.impl;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import DafnyLanguage.psi.DafnyElementType;
import DafnyLanguage.psi.DafnyTokenType;

public interface DafnyTypeImpl {

  IElementType ADD_OP = new DafnyElementType("ADD_OP");
  IElementType ALTERNATIVE_BLOCK = new DafnyElementType("ALTERNATIVE_BLOCK");
  IElementType ALTERNATIVE_BLOCK_CASE = new DafnyElementType("ALTERNATIVE_BLOCK_CASE");
  IElementType AND_OP = new DafnyElementType("AND_OP");
  IElementType ASSERT_STMT = new DafnyElementType("ASSERT_STMT");
  IElementType ASSUME_STMT = new DafnyElementType("ASSUME_STMT");
  IElementType AS_EXPRESSION = new DafnyElementType("AS_EXPRESSION");
  IElementType ATTRIBUTE = new DafnyElementType("ATTRIBUTE");
  IElementType BITVECTOR_FACTOR = new DafnyElementType("BITVECTOR_FACTOR");
  IElementType BLOCK_STMT = new DafnyElementType("BLOCK_STMT");
  IElementType CALC_OP = new DafnyElementType("CALC_OP");
  IElementType CALC_STMT = new DafnyElementType("CALC_STMT");
  IElementType CASE_EXPRESSION = new DafnyElementType("CASE_EXPRESSION");
  IElementType CASE_PATTERN = new DafnyElementType("CASE_PATTERN");
  IElementType CASE_PATTERN_LOCAL = new DafnyElementType("CASE_PATTERN_LOCAL");
  IElementType CASE_STATEMENT = new DafnyElementType("CASE_STATEMENT");
  IElementType CLASS_DECL = new DafnyElementType("CLASS_DECL");
  IElementType CLASS_MEMBER_DECL = new DafnyElementType("CLASS_MEMBER_DECL");
  IElementType CONSTANT_FIELD_DECL = new DafnyElementType("CONSTANT_FIELD_DECL");
  IElementType CONST_ATOM_EXPRESSION = new DafnyElementType("CONST_ATOM_EXPRESSION");
  IElementType C_IDENT_TYPE = new DafnyElementType("C_IDENT_TYPE");
  IElementType DATATYPE_DECL = new DafnyElementType("DATATYPE_DECL");
  IElementType DATATYPE_MEMBER_DECL = new DafnyElementType("DATATYPE_MEMBER_DECL");
  IElementType DEC = new DafnyElementType("DEC");
  IElementType DECL_MODIFIER = new DafnyElementType("DECL_MODIFIER");
  IElementType DECREASES_LIST = new DafnyElementType("DECREASES_LIST");
  IElementType DISPLAY_EXPR = new DafnyElementType("DISPLAY_EXPR");
  IElementType DIVIDED_BLOCK_STMT = new DafnyElementType("DIVIDED_BLOCK_STMT");
  IElementType DOT_SUFFIX = new DafnyElementType("DOT_SUFFIX");
  IElementType ENDLESS_EXPRESSION = new DafnyElementType("ENDLESS_EXPRESSION");
  IElementType EQUIV_EXPRESSION = new DafnyElementType("EQUIV_EXPRESSION");
  IElementType EQUIV_OP = new DafnyElementType("EQUIV_OP");
  IElementType EXISTENTIAL_GUARD = new DafnyElementType("EXISTENTIAL_GUARD");
  IElementType EXISTS = new DafnyElementType("EXISTS");
  IElementType EXPLIES_OP = new DafnyElementType("EXPLIES_OP");
  IElementType EXPRESSION = new DafnyElementType("EXPRESSION");
  IElementType EXPRESSIONS = new DafnyElementType("EXPRESSIONS");
  IElementType FACTOR = new DafnyElementType("FACTOR");
  IElementType FIELD_DECL = new DafnyElementType("FIELD_DECL");
  IElementType FORALL = new DafnyElementType("FORALL");
  IElementType FORALL_STMT = new DafnyElementType("FORALL_STMT");
  IElementType FORMALS = new DafnyElementType("FORMALS");
  IElementType FORMALS_OPTIONAL_IDS = new DafnyElementType("FORMALS_OPTIONAL_IDS");
  IElementType FRAME_EXPRESSION = new DafnyElementType("FRAME_EXPRESSION");
  IElementType FUNCTION_BODY = new DafnyElementType("FUNCTION_BODY");
  IElementType FUNCTION_DECL = new DafnyElementType("FUNCTION_DECL");
  IElementType FUNCTION_SPEC = new DafnyElementType("FUNCTION_SPEC");
  IElementType FU_ME_IDENT = new DafnyElementType("FU_ME_IDENT");
  IElementType F_IDENT_TYPE = new DafnyElementType("F_IDENT_TYPE");
  IElementType GENERIC_INSTANTIATION = new DafnyElementType("GENERIC_INSTANTIATION");
  IElementType GENERIC_PARAMETERS = new DafnyElementType("GENERIC_PARAMETERS");
  IElementType GUARD = new DafnyElementType("GUARD");
  IElementType G_IDENT_TYPE = new DafnyElementType("G_IDENT_TYPE");
  IElementType HASH_CALL = new DafnyElementType("HASH_CALL");
  IElementType IDENT = new DafnyElementType("IDENT");
  IElementType IDENT_TYPE = new DafnyElementType("IDENT_TYPE");
  IElementType IDENT_TYPE_OPTIONAL = new DafnyElementType("IDENT_TYPE_OPTIONAL");
  IElementType IF_STMT = new DafnyElementType("IF_STMT");
  IElementType IMPLIES_EXPLIES_EXPRESSION = new DafnyElementType("IMPLIES_EXPLIES_EXPRESSION");
  IElementType IMPLIES_EXPRESSION = new DafnyElementType("IMPLIES_EXPRESSION");
  IElementType IMPLIES_OP = new DafnyElementType("IMPLIES_OP");
  IElementType ITERATOR_DECL = new DafnyElementType("ITERATOR_DECL");
  IElementType ITERATOR_SPEC = new DafnyElementType("ITERATOR_SPEC");
  IElementType I_SET_DISPLAY_EXPR = new DafnyElementType("I_SET_DISPLAY_EXPR");
  IElementType K_TYPE = new DafnyElementType("K_TYPE");
  IElementType LABEL_IDENT = new DafnyElementType("LABEL_IDENT");
  IElementType LAMBDA_ARROW = new DafnyElementType("LAMBDA_ARROW");
  IElementType LAMBDA_EXPRESSION = new DafnyElementType("LAMBDA_EXPRESSION");
  IElementType LET_EXPR = new DafnyElementType("LET_EXPR");
  IElementType LHS = new DafnyElementType("LHS");
  IElementType LOCAL_IDENT_TYPE_OPTIONAL = new DafnyElementType("LOCAL_IDENT_TYPE_OPTIONAL");
  IElementType LOGICAL_EXPRESSION = new DafnyElementType("LOGICAL_EXPRESSION");
  IElementType LOOP_SPEC = new DafnyElementType("LOOP_SPEC");
  IElementType MAP_COMPREHENSION_EXPR = new DafnyElementType("MAP_COMPREHENSION_EXPR");
  IElementType MAP_DISPLAY_EXPR = new DafnyElementType("MAP_DISPLAY_EXPR");
  IElementType MAP_LITERAL_EXPRESSIONS = new DafnyElementType("MAP_LITERAL_EXPRESSIONS");
  IElementType MATCH_EXPRESSION = new DafnyElementType("MATCH_EXPRESSION");
  IElementType MATCH_STMT = new DafnyElementType("MATCH_STMT");
  IElementType MEMBER_BINDING_UPDATE = new DafnyElementType("MEMBER_BINDING_UPDATE");
  IElementType METHOD_DECL = new DafnyElementType("METHOD_DECL");
  IElementType METHOD_SPEC = new DafnyElementType("METHOD_SPEC");
  IElementType MODIFY_STMT = new DafnyElementType("MODIFY_STMT");
  IElementType MODULE_EXPORT = new DafnyElementType("MODULE_EXPORT");
  IElementType MODULE_EXPORT_SIGNATURE = new DafnyElementType("MODULE_EXPORT_SIGNATURE");
  IElementType MODULE_NAME = new DafnyElementType("MODULE_NAME");
  IElementType MULTI_SET_EXPR = new DafnyElementType("MULTI_SET_EXPR");
  IElementType MUL_OP = new DafnyElementType("MUL_OP");
  IElementType NAMED_EXPR = new DafnyElementType("NAMED_EXPR");
  IElementType NAME_SEGMENT = new DafnyElementType("NAME_SEGMENT");
  IElementType NAME_SEGMENT_FOR_TYPE_NAME = new DafnyElementType("NAME_SEGMENT_FOR_TYPE_NAME");
  IElementType NAT = new DafnyElementType("NAT");
  IElementType NEG_OP = new DafnyElementType("NEG_OP");
  IElementType NEWTYPE_DECL = new DafnyElementType("NEWTYPE_DECL");
  IElementType NEW_ARRAY = new DafnyElementType("NEW_ARRAY");
  IElementType NO_US_IDENT = new DafnyElementType("NO_US_IDENT");
  IElementType OLD_SEMI = new DafnyElementType("OLD_SEMI");
  IElementType ONE_STMT = new DafnyElementType("ONE_STMT");
  IElementType OPT_GENERIC_INSTANTIATION = new DafnyElementType("OPT_GENERIC_INSTANTIATION");
  IElementType OR_OP = new DafnyElementType("OR_OP");
  IElementType OTHER_TYPE_DECL = new DafnyElementType("OTHER_TYPE_DECL");
  IElementType PARENS_EXPRESSION = new DafnyElementType("PARENS_EXPRESSION");
  IElementType POSSIBLY_WILD_EXPRESSION = new DafnyElementType("POSSIBLY_WILD_EXPRESSION");
  IElementType POSSIBLY_WILD_FRAME_EXPRESSION = new DafnyElementType("POSSIBLY_WILD_FRAME_EXPRESSION");
  IElementType PRINT_STMT = new DafnyElementType("PRINT_STMT");
  IElementType QUALIFIED_MODULE_EXPORT = new DafnyElementType("QUALIFIED_MODULE_EXPORT");
  IElementType QUALIFIED_MODULE_EXPORT_SUFFIX = new DafnyElementType("QUALIFIED_MODULE_EXPORT_SUFFIX");
  IElementType QUANTIFIER_DOMAIN = new DafnyElementType("QUANTIFIER_DOMAIN");
  IElementType QUANTIFIER_GUTS = new DafnyElementType("QUANTIFIER_GUTS");
  IElementType Q_SEP = new DafnyElementType("Q_SEP");
  IElementType RELATIONAL_EXPRESSION = new DafnyElementType("RELATIONAL_EXPRESSION");
  IElementType REL_OP = new DafnyElementType("REL_OP");
  IElementType RETURN_STMT = new DafnyElementType("RETURN_STMT");
  IElementType REVEAL_STMT = new DafnyElementType("REVEAL_STMT");
  IElementType RHS = new DafnyElementType("RHS");
  IElementType SET_COMPREHENSION_EXPR = new DafnyElementType("SET_COMPREHENSION_EXPR");
  IElementType SHIFT_TERM = new DafnyElementType("SHIFT_TERM");
  IElementType SKELETON_STMT = new DafnyElementType("SKELETON_STMT");
  IElementType STMT = new DafnyElementType("STMT");
  IElementType STMT_IN_EXPR = new DafnyElementType("STMT_IN_EXPR");
  IElementType SUB_MODULE_DECL = new DafnyElementType("SUB_MODULE_DECL");
  IElementType SUFFIX = new DafnyElementType("SUFFIX");
  IElementType TERM = new DafnyElementType("TERM");
  IElementType TOP_DECL = new DafnyElementType("TOP_DECL");
  IElementType TP_CHAR_OPTION = new DafnyElementType("TP_CHAR_OPTION");
  IElementType TRAIT_DECL = new DafnyElementType("TRAIT_DECL");
  IElementType TYPE_AND_TOKEN = new DafnyElementType("TYPE_AND_TOKEN");
  IElementType TYPE_IDENT_OPTIONAL = new DafnyElementType("TYPE_IDENT_OPTIONAL");
  IElementType TYPE_NAME_OR_CTOR_SUFFIX = new DafnyElementType("TYPE_NAME_OR_CTOR_SUFFIX");
  IElementType TYPE_PARAMETER_CHARACTERISTICS = new DafnyElementType("TYPE_PARAMETER_CHARACTERISTICS");
  IElementType UNARY_EXPRESSION = new DafnyElementType("UNARY_EXPRESSION");
  IElementType UPDATE_STMT = new DafnyElementType("UPDATE_STMT");
  IElementType VARIANCE = new DafnyElementType("VARIANCE");
  IElementType VAR_DECL_STATEMENT = new DafnyElementType("VAR_DECL_STATEMENT");
  IElementType WHILE_STMT = new DafnyElementType("WHILE_STMT");
  IElementType WILD_IDENT = new DafnyElementType("WILD_IDENT");

  IElementType ABSTRACT = new DafnyTokenType("abstract");
  IElementType ALLOCATED = new DafnyTokenType("allocated");
  IElementType AND = new DafnyTokenType("and");
  IElementType ARRAYTOKEN = new DafnyTokenType("arrayToken");
  IElementType ARRAYTOKEN_Q = new DafnyTokenType("arrayToken_q");
  IElementType ARRQUEST = new DafnyTokenType("arrQuest");
  IElementType AS = new DafnyTokenType("as");
  IElementType ASSERT = new DafnyTokenType("assert");
  IElementType ASSIGN = new DafnyTokenType("assign");
  IElementType ASSUME = new DafnyTokenType("assume");
  IElementType AT = new DafnyTokenType("at");
  IElementType BACKTICK = new DafnyTokenType("backtick");
  IElementType BIGGEREQ = new DafnyTokenType("biggerEq");
  IElementType BOOL = new DafnyTokenType("bool");
  IElementType BOREDSMILEY = new DafnyTokenType("boredSmiley");
  IElementType BREAK = new DafnyTokenType("break");
  IElementType BULLET = new DafnyTokenType("bullet");
  IElementType BVTOKEN = new DafnyTokenType("bvToken");
  IElementType BY = new DafnyTokenType("by");
  IElementType CALC = new DafnyTokenType("calc");
  IElementType CASE = new DafnyTokenType("case");
  IElementType CHAR = new DafnyTokenType("char");
  IElementType CHARTOKEN = new DafnyTokenType("charToken");
  IElementType CIRCUMFLEX = new DafnyTokenType("circumflex");
  IElementType CLASSTOKEN = new DafnyTokenType("classToken");
  IElementType CLOSEANGLEBRACKET = new DafnyTokenType("closeAngleBracket");
  IElementType CLOSEPAREN = new DafnyTokenType("closeparen");
  IElementType CODATATYPE = new DafnyTokenType("codatatype");
  IElementType COLEMMA = new DafnyTokenType("colemma");
  IElementType COLON = new DafnyTokenType("colon");
  IElementType COMETHOD = new DafnyTokenType("comethod");
  IElementType COMMA = new DafnyTokenType("comma");
  IElementType COMMENT = new DafnyTokenType("comment");
  IElementType CONST = new DafnyTokenType("const");
  IElementType CONSTRUCTOR = new DafnyTokenType("constructor");
  IElementType COPREDICATE = new DafnyTokenType("copredicate");
  IElementType DARROW = new DafnyTokenType("darrow");
  IElementType DATATYPE = new DafnyTokenType("datatype");
  IElementType DECIMALDIGITS = new DafnyTokenType("decimaldigits");
  IElementType DECREASES = new DafnyTokenType("decreases");
  IElementType DIGITS = new DafnyTokenType("digits");
  IElementType DOT = new DafnyTokenType("dot");
  IElementType DOUBLEAND = new DafnyTokenType("doubleAnd");
  IElementType DOUBLECOLON = new DafnyTokenType("doublecolon");
  IElementType DOUBLEDOT = new DafnyTokenType("doubleDot");
  IElementType DOUBLELINEARROW = new DafnyTokenType("doubleLineArrow");
  IElementType DOUBLEOR = new DafnyTokenType("doubleOr");
  IElementType ELLIPSIS = new DafnyTokenType("ellipsis");
  IElementType ELSE = new DafnyTokenType("else");
  IElementType ENSURES = new DafnyTokenType("ensures");
  IElementType EOF = new DafnyTokenType("EOF");
  IElementType EQ = new DafnyTokenType("eq");
  IElementType EQUIVALENTTO = new DafnyTokenType("equivalentTo");
  IElementType EXCMARK = new DafnyTokenType("excMark");
  IElementType EXISTSTOKEN = new DafnyTokenType("existstoken");
  IElementType EXPORT = new DafnyTokenType("export");
  IElementType EXTENDS = new DafnyTokenType("extends");
  IElementType FALSE = new DafnyTokenType("false");
  IElementType FORALLTOKEN = new DafnyTokenType("foralltoken");
  IElementType FREE = new DafnyTokenType("free");
  IElementType FRESH = new DafnyTokenType("fresh");
  IElementType FUNCTION = new DafnyTokenType("function");
  IElementType GETS = new DafnyTokenType("gets");
  IElementType GHOST = new DafnyTokenType("ghost");
  IElementType GHOSTD = new DafnyTokenType("ghostd");
  IElementType HASHTAG = new DafnyTokenType("hashtag");
  IElementType HEXDIGITS = new DafnyTokenType("hexdigits");
  IElementType IDENTDEF = new DafnyTokenType("identdef");
  IElementType IF = new DafnyTokenType("if");
  IElementType IMAP = new DafnyTokenType("imap");
  IElementType IMPLYLEFT = new DafnyTokenType("implyLeft");
  IElementType IMPLYRIGHT = new DafnyTokenType("implyRight");
  IElementType IMPORT = new DafnyTokenType("import");
  IElementType IN = new DafnyTokenType("in");
  IElementType INCLUDE = new DafnyTokenType("include");
  IElementType INDUCTIVE = new DafnyTokenType("inductive");
  IElementType INT = new DafnyTokenType("int");
  IElementType INVARIANT = new DafnyTokenType("invariant");
  IElementType ISET = new DafnyTokenType("iset");
  IElementType ITERATOR = new DafnyTokenType("iterator");
  IElementType LABEL = new DafnyTokenType("label");
  IElementType LBRACE = new DafnyTokenType("lbrace");
  IElementType LBRACKET = new DafnyTokenType("lbracket");
  IElementType LEMMA = new DafnyTokenType("lemma");
  IElementType LINEARROW = new DafnyTokenType("LineArrow");
  IElementType MAP = new DafnyTokenType("map");
  IElementType MATCH = new DafnyTokenType("match");
  IElementType METHOD = new DafnyTokenType("method");
  IElementType MINUS = new DafnyTokenType("minus");
  IElementType MODIFIES = new DafnyTokenType("modifies");
  IElementType MODIFY = new DafnyTokenType("modify");
  IElementType MODULE = new DafnyTokenType("module");
  IElementType MULTISET = new DafnyTokenType("multiset");
  IElementType NAMESEGMENT_1_2_0 = new DafnyTokenType("NameSegment_1_2_0");
  IElementType NATTOKEN = new DafnyTokenType("nattoken");
  IElementType NEQ = new DafnyTokenType("neq");
  IElementType NEQALT = new DafnyTokenType("neqAlt");
  IElementType NEW = new DafnyTokenType("new");
  IElementType NEWTYPE = new DafnyTokenType("newtype");
  IElementType NOTIN = new DafnyTokenType("notIn");
  IElementType NULL = new DafnyTokenType("null");
  IElementType OBJECT = new DafnyTokenType("object");
  IElementType OBJECT_Q = new DafnyTokenType("object_q");
  IElementType OLD = new DafnyTokenType("old");
  IElementType OPENANGLEBRACKET = new DafnyTokenType("openAngleBracket");
  IElementType OPENED = new DafnyTokenType("opened");
  IElementType OPENPAREN = new DafnyTokenType("openparen");
  IElementType ORDINAL = new DafnyTokenType("ORDINAL");
  IElementType PARALLEL = new DafnyTokenType("parallel");
  IElementType PERCENT = new DafnyTokenType("percent");
  IElementType PLUS = new DafnyTokenType("plus");
  IElementType PREDICATE = new DafnyTokenType("predicate");
  IElementType PRINT = new DafnyTokenType("print");
  IElementType PROTECTED = new DafnyTokenType("protected");
  IElementType PROVIDES = new DafnyTokenType("provides");
  IElementType RBRACE = new DafnyTokenType("rbrace");
  IElementType RBRACKET = new DafnyTokenType("rbracket");
  IElementType READS = new DafnyTokenType("reads");
  IElementType REAL = new DafnyTokenType("real");
  IElementType REFINES = new DafnyTokenType("refines");
  IElementType REQUIRES = new DafnyTokenType("requires");
  IElementType RETURN = new DafnyTokenType("return");
  IElementType RETURNS = new DafnyTokenType("returns");
  IElementType REVEAL = new DafnyTokenType("reveal");
  IElementType REVEALS = new DafnyTokenType("reveals");
  IElementType SEMI = new DafnyTokenType("semi");
  IElementType SEQ = new DafnyTokenType("seq");
  IElementType SET = new DafnyTokenType("set");
  IElementType STAR = new DafnyTokenType("star");
  IElementType STATIC = new DafnyTokenType("static");
  IElementType STRING = new DafnyTokenType("string");
  IElementType STRINGTOKEN = new DafnyTokenType("stringToken");
  IElementType SUFFIX_0_1_1_1_2_0 = new DafnyTokenType("Suffix_0_1_1_1_2_0");
  IElementType THEN = new DafnyTokenType("then");
  IElementType THIS = new DafnyTokenType("this");
  IElementType TRAIT = new DafnyTokenType("trait");
  IElementType TRUE = new DafnyTokenType("true");
  IElementType TWOSTATE = new DafnyTokenType("twostate");
  IElementType TYPE = new DafnyTokenType("type");
  IElementType UNCHANGED = new DafnyTokenType("unchanged");
  IElementType VAR = new DafnyTokenType("var");
  IElementType VERTICALBAR = new DafnyTokenType("verticalbar");
  IElementType VERTICALBAREXPRESSION = new DafnyTokenType("verticalbarExpression");
  IElementType WAVEARROW = new DafnyTokenType("waveArrow");
  IElementType WHERE = new DafnyTokenType("where");
  IElementType WHILE = new DafnyTokenType("while");
  IElementType WHILESTMT_1_1_2_2_0 = new DafnyTokenType("WhileStmt_1_1_2_2_0");
  IElementType WITNESS = new DafnyTokenType("witness");
  IElementType YIELD = new DafnyTokenType("yield");
  IElementType YIELDS = new DafnyTokenType("yields");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_OP) {
        return new DafnyAddOpImpl(node);
      }
      else if (type == ALTERNATIVE_BLOCK) {
        return new DafnyAlternativeBlockImpl(node);
      }
      else if (type == ALTERNATIVE_BLOCK_CASE) {
        return new DafnyAlternativeBlockCaseImpl(node);
      }
      else if (type == AND_OP) {
        return new DafnyAndOpImpl(node);
      }
      else if (type == ASSERT_STMT) {
        return new DafnyAssertStmtImpl(node);
      }
      else if (type == ASSUME_STMT) {
        return new DafnyAssumeStmtImpl(node);
      }
      else if (type == AS_EXPRESSION) {
        return new DafnyAsExpressionImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new DafnyAttributeImpl(node);
      }
      else if (type == BITVECTOR_FACTOR) {
        return new DafnyBitvectorFactorImpl(node);
      }
      else if (type == BLOCK_STMT) {
        return new DafnyBlockStmtImpl(node);
      }
      else if (type == CALC_OP) {
        return new DafnyCalcOpImpl(node);
      }
      else if (type == CALC_STMT) {
        return new DafnyCalcStmtImpl(node);
      }
      else if (type == CASE_EXPRESSION) {
        return new DafnyCaseExpressionImpl(node);
      }
      else if (type == CASE_PATTERN) {
        return new DafnyCasePatternImpl(node);
      }
      else if (type == CASE_PATTERN_LOCAL) {
        return new DafnyCasePatternLocalImpl(node);
      }
      else if (type == CASE_STATEMENT) {
        return new DafnyCaseStatementImpl(node);
      }
      else if (type == CLASS_DECL) {
        return new DafnyClassDeclImpl(node);
      }
      else if (type == CLASS_MEMBER_DECL) {
        return new DafnyClassMemberDeclImpl(node);
      }
      else if (type == CONSTANT_FIELD_DECL) {
        return new DafnyConstantFieldDeclImpl(node);
      }
      else if (type == CONST_ATOM_EXPRESSION) {
        return new DafnyConstAtomExpressionImpl(node);
      }
      else if (type == C_IDENT_TYPE) {
        return new DafnyCIdentTypeImpl(node);
      }
      else if (type == DATATYPE_DECL) {
        return new DafnyDatatypeDeclImpl(node);
      }
      else if (type == DATATYPE_MEMBER_DECL) {
        return new DafnyDatatypeMemberDeclImpl(node);
      }
      else if (type == DEC) {
        return new DafnyDecImpl(node);
      }
      else if (type == DECL_MODIFIER) {
        return new DafnyDeclModifierImpl(node);
      }
      else if (type == DECREASES_LIST) {
        return new DafnyDecreasesListImpl(node);
      }
      else if (type == DISPLAY_EXPR) {
        return new DafnyDisplayExprImpl(node);
      }
      else if (type == DIVIDED_BLOCK_STMT) {
        return new DafnyDividedBlockStmtImpl(node);
      }
      else if (type == DOT_SUFFIX) {
        return new DafnyDotSuffixImpl(node);
      }
      else if (type == ENDLESS_EXPRESSION) {
        return new DafnyEndlessExpressionImpl(node);
      }
      else if (type == EQUIV_EXPRESSION) {
        return new DafnyEquivExpressionImpl(node);
      }
      else if (type == EQUIV_OP) {
        return new DafnyEquivOpImpl(node);
      }
      else if (type == EXISTENTIAL_GUARD) {
        return new DafnyExistentialGuardImpl(node);
      }
      else if (type == EXISTS) {
        return new DafnyExistsImpl(node);
      }
      else if (type == EXPLIES_OP) {
        return new DafnyExpliesOpImpl(node);
      }
      else if (type == EXPRESSION) {
        return new DafnyExpressionImpl(node);
      }
      else if (type == EXPRESSIONS) {
        return new DafnyExpressionsImpl(node);
      }
      else if (type == FACTOR) {
        return new DafnyFactorImpl(node);
      }
      else if (type == FIELD_DECL) {
        return new DafnyFieldDeclImpl(node);
      }
      else if (type == FORALL) {
        return new DafnyForallImpl(node);
      }
      else if (type == FORALL_STMT) {
        return new DafnyForallStmtImpl(node);
      }
      else if (type == FORMALS) {
        return new DafnyFormalsImpl(node);
      }
      else if (type == FORMALS_OPTIONAL_IDS) {
        return new DafnyFormalsOptionalIdsImpl(node);
      }
      else if (type == FRAME_EXPRESSION) {
        return new DafnyFrameExpressionImpl(node);
      }
      else if (type == FUNCTION_BODY) {
        return new DafnyFunctionBodyImpl(node);
      }
      else if (type == FUNCTION_DECL) {
        return new DafnyFunctionDeclImpl(node);
      }
      else if (type == FUNCTION_SPEC) {
        return new DafnyFunctionSpecImpl(node);
      }
      else if (type == FU_ME_IDENT) {
        return new DafnyFuMeIdentImpl(node);
      }
      else if (type == F_IDENT_TYPE) {
        return new DafnyFIdentTypeImpl(node);
      }
      else if (type == GENERIC_INSTANTIATION) {
        return new DafnyGenericInstantiationImpl(node);
      }
      else if (type == GENERIC_PARAMETERS) {
        return new DafnyGenericParametersImpl(node);
      }
      else if (type == GUARD) {
        return new DafnyGuardImpl(node);
      }
      else if (type == G_IDENT_TYPE) {
        return new DafnyGIdentTypeImpl(node);
      }
      else if (type == HASH_CALL) {
        return new DafnyHashCallImpl(node);
      }
      else if (type == IDENT) {
        return new DafnyIdentImpl(node);
      }
      else if (type == IDENT_TYPE) {
        return new DafnyIdentTypeImpl(node);
      }
      else if (type == IDENT_TYPE_OPTIONAL) {
        return new DafnyIdentTypeOptionalImpl(node);
      }
      else if (type == IF_STMT) {
        return new DafnyIfStmtImpl(node);
      }
      else if (type == IMPLIES_EXPLIES_EXPRESSION) {
        return new DafnyImpliesExpliesExpressionImpl(node);
      }
      else if (type == IMPLIES_EXPRESSION) {
        return new DafnyImpliesExpressionImpl(node);
      }
      else if (type == IMPLIES_OP) {
        return new DafnyImpliesOpImpl(node);
      }
      else if (type == ITERATOR_DECL) {
        return new DafnyIteratorDeclImpl(node);
      }
      else if (type == ITERATOR_SPEC) {
        return new DafnyIteratorSpecImpl(node);
      }
      else if (type == I_SET_DISPLAY_EXPR) {
        return new DafnyISetDisplayExprImpl(node);
      }
      else if (type == K_TYPE) {
        return new DafnyKTypeImpl(node);
      }
      else if (type == LABEL_IDENT) {
        return new DafnyLabelIdentImpl(node);
      }
      else if (type == LAMBDA_ARROW) {
        return new DafnyLambdaArrowImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new DafnyLambdaExpressionImpl(node);
      }
      else if (type == LET_EXPR) {
        return new DafnyLetExprImpl(node);
      }
      else if (type == LHS) {
        return new DafnyLhsImpl(node);
      }
      else if (type == LOCAL_IDENT_TYPE_OPTIONAL) {
        return new DafnyLocalIdentTypeOptionalImpl(node);
      }
      else if (type == LOGICAL_EXPRESSION) {
        return new DafnyLogicalExpressionImpl(node);
      }
      else if (type == LOOP_SPEC) {
        return new DafnyLoopSpecImpl(node);
      }
      else if (type == MAP_COMPREHENSION_EXPR) {
        return new DafnyMapComprehensionExprImpl(node);
      }
      else if (type == MAP_DISPLAY_EXPR) {
        return new DafnyMapDisplayExprImpl(node);
      }
      else if (type == MAP_LITERAL_EXPRESSIONS) {
        return new DafnyMapLiteralExpressionsImpl(node);
      }
      else if (type == MATCH_EXPRESSION) {
        return new DafnyMatchExpressionImpl(node);
      }
      else if (type == MATCH_STMT) {
        return new DafnyMatchStmtImpl(node);
      }
      else if (type == MEMBER_BINDING_UPDATE) {
        return new DafnyMemberBindingUpdateImpl(node);
      }
      else if (type == METHOD_DECL) {
        return new DafnyMethodDeclImpl(node);
      }
      else if (type == METHOD_SPEC) {
        return new DafnyMethodSpecImpl(node);
      }
      else if (type == MODIFY_STMT) {
        return new DafnyModifyStmtImpl(node);
      }
      else if (type == MODULE_EXPORT) {
        return new DafnyModuleExportImpl(node);
      }
      else if (type == MODULE_EXPORT_SIGNATURE) {
        return new DafnyModuleExportSignatureImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new DafnyModuleNameImpl(node);
      }
      else if (type == MULTI_SET_EXPR) {
        return new DafnyMultiSetExprImpl(node);
      }
      else if (type == MUL_OP) {
        return new DafnyMulOpImpl(node);
      }
      else if (type == NAMED_EXPR) {
        return new DafnyNamedExprImpl(node);
      }
      else if (type == NAME_SEGMENT) {
        return new DafnyNameSegmentImpl(node);
      }
      else if (type == NAME_SEGMENT_FOR_TYPE_NAME) {
        return new DafnyNameSegmentForTypeNameImpl(node);
      }
      else if (type == NAT) {
        return new DafnyNatImpl(node);
      }
      else if (type == NEG_OP) {
        return new DafnyNegOpImpl(node);
      }
      else if (type == NEWTYPE_DECL) {
        return new DafnyNewtypeDeclImpl(node);
      }
      else if (type == NEW_ARRAY) {
        return new DafnyNewArrayImpl(node);
      }
      else if (type == NO_US_IDENT) {
        return new DafnyNoUSIdentImpl(node);
      }
      else if (type == OLD_SEMI) {
        return new DafnyOldSemiImpl(node);
      }
      else if (type == ONE_STMT) {
        return new DafnyOneStmtImpl(node);
      }
      else if (type == OPT_GENERIC_INSTANTIATION) {
        return new DafnyOptGenericInstantiationImpl(node);
      }
      else if (type == OR_OP) {
        return new DafnyOrOpImpl(node);
      }
      else if (type == OTHER_TYPE_DECL) {
        return new DafnyOtherTypeDeclImpl(node);
      }
      else if (type == PARENS_EXPRESSION) {
        return new DafnyParensExpressionImpl(node);
      }
      else if (type == POSSIBLY_WILD_EXPRESSION) {
        return new DafnyPossiblyWildExpressionImpl(node);
      }
      else if (type == POSSIBLY_WILD_FRAME_EXPRESSION) {
        return new DafnyPossiblyWildFrameExpressionImpl(node);
      }
      else if (type == PRINT_STMT) {
        return new DafnyPrintStmtImpl(node);
      }
      else if (type == QUALIFIED_MODULE_EXPORT) {
        return new DafnyQualifiedModuleExportImpl(node);
      }
      else if (type == QUALIFIED_MODULE_EXPORT_SUFFIX) {
        return new DafnyQualifiedModuleExportSuffixImpl(node);
      }
      else if (type == QUANTIFIER_DOMAIN) {
        return new DafnyQuantifierDomainImpl(node);
      }
      else if (type == QUANTIFIER_GUTS) {
        return new DafnyQuantifierGutsImpl(node);
      }
      else if (type == Q_SEP) {
        return new DafnyQSepImpl(node);
      }
      else if (type == RELATIONAL_EXPRESSION) {
        return new DafnyRelationalExpressionImpl(node);
      }
      else if (type == REL_OP) {
        return new DafnyRelOpImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new DafnyReturnStmtImpl(node);
      }
      else if (type == REVEAL_STMT) {
        return new DafnyRevealStmtImpl(node);
      }
      else if (type == RHS) {
        return new DafnyRhsImpl(node);
      }
      else if (type == SET_COMPREHENSION_EXPR) {
        return new DafnySetComprehensionExprImpl(node);
      }
      else if (type == SHIFT_TERM) {
        return new DafnyShiftTermImpl(node);
      }
      else if (type == SKELETON_STMT) {
        return new DafnySkeletonStmtImpl(node);
      }
      else if (type == STMT) {
        return new DafnyStmtImpl(node);
      }
      else if (type == STMT_IN_EXPR) {
        return new DafnyStmtInExprImpl(node);
      }
      else if (type == SUB_MODULE_DECL) {
        return new DafnySubModuleDeclImpl(node);
      }
      else if (type == SUFFIX) {
        return new DafnySuffixImpl(node);
      }
      else if (type == TERM) {
        return new DafnyTermImpl(node);
      }
      else if (type == TOP_DECL) {
        return new DafnyTopDeclImpl(node);
      }
      else if (type == TP_CHAR_OPTION) {
        return new DafnyTPCharOptionImpl(node);
      }
      else if (type == TRAIT_DECL) {
        return new DafnyTraitDeclImpl(node);
      }
      else if (type == TYPE_AND_TOKEN) {
        return new DafnyTypeAndTokenImpl(node);
      }
      else if (type == TYPE_IDENT_OPTIONAL) {
        return new DafnyTypeIdentOptionalImpl(node);
      }
      else if (type == TYPE_NAME_OR_CTOR_SUFFIX) {
        return new DafnyTypeNameOrCtorSuffixImpl(node);
      }
      else if (type == TYPE_PARAMETER_CHARACTERISTICS) {
        return new DafnyTypeParameterCharacteristicsImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new DafnyUnaryExpressionImpl(node);
      }
      else if (type == UPDATE_STMT) {
        return new DafnyUpdateStmtImpl(node);
      }
      else if (type == VARIANCE) {
        return new DafnyVarianceImpl(node);
      }
      else if (type == VAR_DECL_STATEMENT) {
        return new DafnyVarDeclStatementImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new DafnyWhileStmtImpl(node);
      }
      else if (type == WILD_IDENT) {
        return new DafnyWildIdentImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
