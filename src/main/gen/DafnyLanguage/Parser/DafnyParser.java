// This is a generated file. Not intended for manual editing.
package DafnyLanguage.Parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static DafnyLanguage.psi.impl.DafnyTypeImpl.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DafnyParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADD_OP) {
      r = AddOp(b, 0);
    }
    else if (t == ALTERNATIVE_BLOCK) {
      r = AlternativeBlock(b, 0);
    }
    else if (t == ALTERNATIVE_BLOCK_CASE) {
      r = AlternativeBlockCase(b, 0);
    }
    else if (t == AND_OP) {
      r = AndOp(b, 0);
    }
    else if (t == AS_EXPRESSION) {
      r = AsExpression(b, 0);
    }
    else if (t == ASSERT_STMT) {
      r = AssertStmt(b, 0);
    }
    else if (t == ASSUME_STMT) {
      r = AssumeStmt(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = Attribute(b, 0);
    }
    else if (t == BITVECTOR_FACTOR) {
      r = BitvectorFactor(b, 0);
    }
    else if (t == BLOCK_STMT) {
      r = BlockStmt(b, 0);
    }
    else if (t == C_IDENT_TYPE) {
      r = CIdentType(b, 0);
    }
    else if (t == CALC_OP) {
      r = CalcOp(b, 0);
    }
    else if (t == CALC_STMT) {
      r = CalcStmt(b, 0);
    }
    else if (t == CASE_EXPRESSION) {
      r = CaseExpression(b, 0);
    }
    else if (t == CASE_PATTERN) {
      r = CasePattern(b, 0);
    }
    else if (t == CASE_PATTERN_LOCAL) {
      r = CasePatternLocal(b, 0);
    }
    else if (t == CASE_STATEMENT) {
      r = CaseStatement(b, 0);
    }
    else if (t == CLASS_DECL) {
      r = ClassDecl(b, 0);
    }
    else if (t == CLASS_MEMBER_DECL) {
      r = ClassMemberDecl(b, 0);
    }
    else if (t == CONST_ATOM_EXPRESSION) {
      r = ConstAtomExpression(b, 0);
    }
    else if (t == CONSTANT_FIELD_DECL) {
      r = ConstantFieldDecl(b, 0);
    }
    else if (t == DATATYPE_DECL) {
      r = DatatypeDecl(b, 0);
    }
    else if (t == DATATYPE_MEMBER_DECL) {
      r = DatatypeMemberDecl(b, 0);
    }
    else if (t == DEC) {
      r = Dec(b, 0);
    }
    else if (t == DECL_MODIFIER) {
      r = DeclModifier(b, 0);
    }
    else if (t == DECREASES_LIST) {
      r = DecreasesList(b, 0);
    }
    else if (t == DISPLAY_EXPR) {
      r = DisplayExpr(b, 0);
    }
    else if (t == DIVIDED_BLOCK_STMT) {
      r = DividedBlockStmt(b, 0);
    }
    else if (t == DOT_SUFFIX) {
      r = DotSuffix(b, 0);
    }
    else if (t == ENDLESS_EXPRESSION) {
      r = EndlessExpression(b, 0);
    }
    else if (t == EQUIV_EXPRESSION) {
      r = EquivExpression(b, 0);
    }
    else if (t == EQUIV_OP) {
      r = EquivOp(b, 0);
    }
    else if (t == EXISTENTIAL_GUARD) {
      r = ExistentialGuard(b, 0);
    }
    else if (t == EXISTS) {
      r = Exists(b, 0);
    }
    else if (t == EXPLIES_OP) {
      r = ExpliesOp(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == EXPRESSIONS) {
      r = Expressions(b, 0);
    }
    else if (t == F_IDENT_TYPE) {
      r = FIdentType(b, 0);
    }
    else if (t == FACTOR) {
      r = Factor(b, 0);
    }
    else if (t == FIELD_DECL) {
      r = FieldDecl(b, 0);
    }
    else if (t == FORALL) {
      r = Forall(b, 0);
    }
    else if (t == FORALL_STMT) {
      r = ForallStmt(b, 0);
    }
    else if (t == FORMALS) {
      r = Formals(b, 0);
    }
    else if (t == FORMALS_OPTIONAL_IDS) {
      r = FormalsOptionalIds(b, 0);
    }
    else if (t == FRAME_EXPRESSION) {
      r = FrameExpression(b, 0);
    }
    else if (t == FU_ME_IDENT) {
      r = FuMe_Ident(b, 0);
    }
    else if (t == FUNCTION_BODY) {
      r = FunctionBody(b, 0);
    }
    else if (t == FUNCTION_DECL) {
      r = FunctionDecl(b, 0);
    }
    else if (t == FUNCTION_SPEC) {
      r = FunctionSpec(b, 0);
    }
    else if (t == G_IDENT_TYPE) {
      r = GIdentType(b, 0);
    }
    else if (t == GENERIC_INSTANTIATION) {
      r = GenericInstantiation(b, 0);
    }
    else if (t == GENERIC_PARAMETERS) {
      r = GenericParameters(b, 0);
    }
    else if (t == GUARD) {
      r = Guard(b, 0);
    }
    else if (t == HASH_CALL) {
      r = HashCall(b, 0);
    }
    else if (t == I_SET_DISPLAY_EXPR) {
      r = ISetDisplayExpr(b, 0);
    }
    else if (t == IDENT) {
      r = Ident(b, 0);
    }
    else if (t == IDENT_TYPE) {
      r = IdentType(b, 0);
    }
    else if (t == IDENT_TYPE_OPTIONAL) {
      r = IdentTypeOptional(b, 0);
    }
    else if (t == IF_STMT) {
      r = IfStmt(b, 0);
    }
    else if (t == IMPLIES_EXPLIES_EXPRESSION) {
      r = ImpliesExpliesExpression(b, 0);
    }
    else if (t == IMPLIES_EXPRESSION) {
      r = ImpliesExpression(b, 0);
    }
    else if (t == IMPLIES_OP) {
      r = ImpliesOp(b, 0);
    }
    else if (t == ITERATOR_DECL) {
      r = IteratorDecl(b, 0);
    }
    else if (t == ITERATOR_SPEC) {
      r = IteratorSpec(b, 0);
    }
    else if (t == K_TYPE) {
      r = KType(b, 0);
    }
    else if (t == LABEL_IDENT) {
      r = LabelIdent(b, 0);
    }
    else if (t == LAMBDA_ARROW) {
      r = LambdaArrow(b, 0);
    }
    else if (t == LAMBDA_EXPRESSION) {
      r = LambdaExpression(b, 0);
    }
    else if (t == LET_EXPR) {
      r = LetExpr(b, 0);
    }
    else if (t == LHS) {
      r = Lhs(b, 0);
    }
    else if (t == LOCAL_IDENT_TYPE_OPTIONAL) {
      r = LocalIdentTypeOptional(b, 0);
    }
    else if (t == LOGICAL_EXPRESSION) {
      r = LogicalExpression(b, 0);
    }
    else if (t == LOOP_SPEC) {
      r = LoopSpec(b, 0);
    }
    else if (t == MAP_COMPREHENSION_EXPR) {
      r = MapComprehensionExpr(b, 0);
    }
    else if (t == MAP_DISPLAY_EXPR) {
      r = MapDisplayExpr(b, 0);
    }
    else if (t == MAP_LITERAL_EXPRESSIONS) {
      r = MapLiteralExpressions(b, 0);
    }
    else if (t == MATCH_EXPRESSION) {
      r = MatchExpression(b, 0);
    }
    else if (t == MATCH_STMT) {
      r = MatchStmt(b, 0);
    }
    else if (t == MEMBER_BINDING_UPDATE) {
      r = MemberBindingUpdate(b, 0);
    }
    else if (t == METHOD_DECL) {
      r = MethodDecl(b, 0);
    }
    else if (t == METHOD_SPEC) {
      r = MethodSpec(b, 0);
    }
    else if (t == MODIFY_STMT) {
      r = ModifyStmt(b, 0);
    }
    else if (t == MODULE_EXPORT) {
      r = ModuleExport(b, 0);
    }
    else if (t == MODULE_EXPORT_SIGNATURE) {
      r = ModuleExportSignature(b, 0);
    }
    else if (t == MODULE_NAME) {
      r = ModuleName(b, 0);
    }
    else if (t == MUL_OP) {
      r = MulOp(b, 0);
    }
    else if (t == MULTI_SET_EXPR) {
      r = MultiSetExpr(b, 0);
    }
    else if (t == NAME_SEGMENT) {
      r = NameSegment(b, 0);
    }
    else if (t == NAME_SEGMENT_FOR_TYPE_NAME) {
      r = NameSegmentForTypeName(b, 0);
    }
    else if (t == NAMED_EXPR) {
      r = NamedExpr(b, 0);
    }
    else if (t == NAT) {
      r = Nat(b, 0);
    }
    else if (t == NEG_OP) {
      r = NegOp(b, 0);
    }
    else if (t == NEW_ARRAY) {
      r = NewArray(b, 0);
    }
    else if (t == NEWTYPE_DECL) {
      r = NewtypeDecl(b, 0);
    }
    else if (t == NO_US_IDENT) {
      r = NoUSIdent(b, 0);
    }
    else if (t == OLD_SEMI) {
      r = OldSemi(b, 0);
    }
    else if (t == ONE_STMT) {
      r = OneStmt(b, 0);
    }
    else if (t == OPT_GENERIC_INSTANTIATION) {
      r = OptGenericInstantiation(b, 0);
    }
    else if (t == OR_OP) {
      r = OrOp(b, 0);
    }
    else if (t == OTHER_TYPE_DECL) {
      r = OtherTypeDecl(b, 0);
    }
    else if (t == PARENS_EXPRESSION) {
      r = ParensExpression(b, 0);
    }
    else if (t == POSSIBLY_WILD_EXPRESSION) {
      r = PossiblyWildExpression(b, 0);
    }
    else if (t == POSSIBLY_WILD_FRAME_EXPRESSION) {
      r = PossiblyWildFrameExpression(b, 0);
    }
    else if (t == PRINT_STMT) {
      r = PrintStmt(b, 0);
    }
    else if (t == Q_SEP) {
      r = QSep(b, 0);
    }
    else if (t == QUALIFIED_MODULE_EXPORT) {
      r = QualifiedModuleExport(b, 0);
    }
    else if (t == QUALIFIED_MODULE_EXPORT_SUFFIX) {
      r = QualifiedModuleExportSuffix(b, 0);
    }
    else if (t == QUANTIFIER_DOMAIN) {
      r = QuantifierDomain(b, 0);
    }
    else if (t == QUANTIFIER_GUTS) {
      r = QuantifierGuts(b, 0);
    }
    else if (t == REL_OP) {
      r = RelOp(b, 0);
    }
    else if (t == RELATIONAL_EXPRESSION) {
      r = RelationalExpression(b, 0);
    }
    else if (t == RETURN_STMT) {
      r = ReturnStmt(b, 0);
    }
    else if (t == REVEAL_STMT) {
      r = RevealStmt(b, 0);
    }
    else if (t == RHS) {
      r = Rhs(b, 0);
    }
    else if (t == SET_COMPREHENSION_EXPR) {
      r = SetComprehensionExpr(b, 0);
    }
    else if (t == SHIFT_TERM) {
      r = ShiftTerm(b, 0);
    }
    else if (t == SKELETON_STMT) {
      r = SkeletonStmt(b, 0);
    }
    else if (t == STMT) {
      r = Stmt(b, 0);
    }
    else if (t == STMT_IN_EXPR) {
      r = StmtInExpr(b, 0);
    }
    else if (t == SUB_MODULE_DECL) {
      r = SubModuleDecl(b, 0);
    }
    else if (t == SUFFIX) {
      r = Suffix(b, 0);
    }
    else if (t == TP_CHAR_OPTION) {
      r = TPCharOption(b, 0);
    }
    else if (t == TERM) {
      r = Term(b, 0);
    }
    else if (t == TOP_DECL) {
      r = TopDecl(b, 0);
    }
    else if (t == TRAIT_DECL) {
      r = TraitDecl(b, 0);
    }
    else if (t == TYPE_AND_TOKEN) {
      r = TypeAndToken(b, 0);
    }
    else if (t == TYPE_IDENT_OPTIONAL) {
      r = TypeIdentOptional(b, 0);
    }
    else if (t == TYPE_NAME_OR_CTOR_SUFFIX) {
      r = TypeNameOrCtorSuffix(b, 0);
    }
    else if (t == TYPE_PARAMETER_CHARACTERISTICS) {
      r = TypeParameterCharacteristics(b, 0);
    }
    else if (t == UNARY_EXPRESSION) {
      r = UnaryExpression(b, 0);
    }
    else if (t == UPDATE_STMT) {
      r = UpdateStmt(b, 0);
    }
    else if (t == VAR_DECL_STATEMENT) {
      r = VarDeclStatement(b, 0);
    }
    else if (t == VARIANCE) {
      r = Variance(b, 0);
    }
    else if (t == WHILE_STMT) {
      r = WhileStmt(b, 0);
    }
    else if (t == WILD_IDENT) {
      r = WildIdent(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Dafny(b, l + 1);
  }

  /* ********************************************************** */
  // plus | minus
  public static boolean AddOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddOp")) return false;
    if (!nextTokenIs(b, "<add op>", MINUS, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_OP, "<add op>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lbrace (AlternativeBlockCase)* rbrace
  //      | AlternativeBlockCase (AlternativeBlockCase)*
  public static boolean AlternativeBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlock")) return false;
    if (!nextTokenIs(b, "<alternative block>", CASE, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALTERNATIVE_BLOCK, "<alternative block>");
    r = AlternativeBlock_0(b, l + 1);
    if (!r) r = AlternativeBlock_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lbrace (AlternativeBlockCase)* rbrace
  private static boolean AlternativeBlock_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlock_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && AlternativeBlock_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AlternativeBlockCase)*
  private static boolean AlternativeBlock_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlock_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AlternativeBlock_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AlternativeBlock_0_1", c)) break;
    }
    return true;
  }

  // (AlternativeBlockCase)
  private static boolean AlternativeBlock_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlock_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlternativeBlockCase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AlternativeBlockCase (AlternativeBlockCase)*
  private static boolean AlternativeBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlock_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlternativeBlockCase(b, l + 1);
    r = r && AlternativeBlock_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AlternativeBlockCase)*
  private static boolean AlternativeBlock_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlock_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AlternativeBlock_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AlternativeBlock_1_1", c)) break;
    }
    return true;
  }

  // (AlternativeBlockCase)
  private static boolean AlternativeBlock_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlock_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlternativeBlockCase(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // case (ExistentialGuard | Expression) darrow (Stmt)*
  public static boolean AlternativeBlockCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlockCase")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && AlternativeBlockCase_1(b, l + 1);
    r = r && consumeToken(b, DARROW);
    r = r && AlternativeBlockCase_3(b, l + 1);
    exit_section_(b, m, ALTERNATIVE_BLOCK_CASE, r);
    return r;
  }

  // ExistentialGuard | Expression
  private static boolean AlternativeBlockCase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlockCase_1")) return false;
    boolean r;
    r = ExistentialGuard(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    return r;
  }

  // (Stmt)*
  private static boolean AlternativeBlockCase_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlockCase_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AlternativeBlockCase_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AlternativeBlockCase_3", c)) break;
    }
    return true;
  }

  // (Stmt)
  private static boolean AlternativeBlockCase_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AlternativeBlockCase_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // doubleAnd | '\u2227'
  public static boolean AndOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AndOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_OP, "<and op>");
    r = consumeToken(b, DOUBLEAND);
    if (!r) r = consumeToken(b, "\\u2227");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UnaryExpression (as TypeAndToken)*
  public static boolean AsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS_EXPRESSION, "<as expression>");
    r = UnaryExpression(b, l + 1);
    r = r && AsExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (as TypeAndToken)*
  private static boolean AsExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AsExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AsExpression_1", c)) break;
    }
    return true;
  }

  // as TypeAndToken
  private static boolean AsExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AsExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assert
  //  (Attribute)*
  //  (
  //      (LabelIdent colon)? Expression (by BlockStmt |semi)
  //      | ellipsis semi
  //  )
  public static boolean AssertStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSERT);
    r = r && AssertStmt_1(b, l + 1);
    r = r && AssertStmt_2(b, l + 1);
    exit_section_(b, m, ASSERT_STMT, r);
    return r;
  }

  // (Attribute)*
  private static boolean AssertStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AssertStmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssertStmt_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean AssertStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LabelIdent colon)? Expression (by BlockStmt |semi)
  //      | ellipsis semi
  private static boolean AssertStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssertStmt_2_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, ELLIPSIS, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LabelIdent colon)? Expression (by BlockStmt |semi)
  private static boolean AssertStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssertStmt_2_0_0(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && AssertStmt_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LabelIdent colon)?
  private static boolean AssertStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_2_0_0")) return false;
    AssertStmt_2_0_0_0(b, l + 1);
    return true;
  }

  // LabelIdent colon
  private static boolean AssertStmt_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelIdent(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // by BlockStmt |semi
  private static boolean AssertStmt_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AssertStmt_2_0_2_0(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // by BlockStmt
  private static boolean AssertStmt_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertStmt_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BY);
    r = r && BlockStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assume (Attribute)* (Expression | ellipsis) semi
  public static boolean AssumeStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssumeStmt")) return false;
    if (!nextTokenIs(b, ASSUME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSUME);
    r = r && AssumeStmt_1(b, l + 1);
    r = r && AssumeStmt_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, ASSUME_STMT, r);
    return r;
  }

  // (Attribute)*
  private static boolean AssumeStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssumeStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!AssumeStmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AssumeStmt_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean AssumeStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssumeStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression | ellipsis
  private static boolean AssumeStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssumeStmt_2")) return false;
    boolean r;
    r = Expression(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    return r;
  }

  /* ********************************************************** */
  // lbrace colon NoUSIdent (Expressions)? rbrace
  public static boolean Attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACE, COLON);
    r = r && NoUSIdent(b, l + 1);
    r = r && Attribute_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  // (Expressions)?
  private static boolean Attribute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_3")) return false;
    Attribute_3_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean Attribute_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Attribute_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AsExpression
  //  (
  //      (
  //          and  AsExpression ( and AsExpression)*
  //          | verticalbar AsExpression (verticalbar AsExpression )*
  //          | circumflex AsExpression ( circumflex AsExpression)*
  //     )
  //  )?
  public static boolean BitvectorFactor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITVECTOR_FACTOR, "<bitvector factor>");
    r = AsExpression(b, l + 1);
    r = r && BitvectorFactor_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //      (
  //          and  AsExpression ( and AsExpression)*
  //          | verticalbar AsExpression (verticalbar AsExpression )*
  //          | circumflex AsExpression ( circumflex AsExpression)*
  //     )
  //  )?
  private static boolean BitvectorFactor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1")) return false;
    BitvectorFactor_1_0(b, l + 1);
    return true;
  }

  // and  AsExpression ( and AsExpression)*
  //          | verticalbar AsExpression (verticalbar AsExpression )*
  //          | circumflex AsExpression ( circumflex AsExpression)*
  private static boolean BitvectorFactor_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitvectorFactor_1_0_0(b, l + 1);
    if (!r) r = BitvectorFactor_1_0_1(b, l + 1);
    if (!r) r = BitvectorFactor_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // and  AsExpression ( and AsExpression)*
  private static boolean BitvectorFactor_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && AsExpression(b, l + 1);
    r = r && BitvectorFactor_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( and AsExpression)*
  private static boolean BitvectorFactor_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BitvectorFactor_1_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitvectorFactor_1_0_0_2", c)) break;
    }
    return true;
  }

  // and AsExpression
  private static boolean BitvectorFactor_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && AsExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // verticalbar AsExpression (verticalbar AsExpression )*
  private static boolean BitvectorFactor_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERTICALBAR);
    r = r && AsExpression(b, l + 1);
    r = r && BitvectorFactor_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (verticalbar AsExpression )*
  private static boolean BitvectorFactor_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BitvectorFactor_1_0_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitvectorFactor_1_0_1_2", c)) break;
    }
    return true;
  }

  // verticalbar AsExpression
  private static boolean BitvectorFactor_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERTICALBAR);
    r = r && AsExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // circumflex AsExpression ( circumflex AsExpression)*
  private static boolean BitvectorFactor_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CIRCUMFLEX);
    r = r && AsExpression(b, l + 1);
    r = r && BitvectorFactor_1_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( circumflex AsExpression)*
  private static boolean BitvectorFactor_1_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BitvectorFactor_1_0_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BitvectorFactor_1_0_2_2", c)) break;
    }
    return true;
  }

  // circumflex AsExpression
  private static boolean BitvectorFactor_1_0_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitvectorFactor_1_0_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CIRCUMFLEX);
    r = r && AsExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lbrace (Stmt)* rbrace
  public static boolean BlockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && BlockStmt_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK_STMT, r);
    return r;
  }

  // (Stmt)*
  private static boolean BlockStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BlockStmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockStmt_1", c)) break;
    }
    return true;
  }

  // (Stmt)
  private static boolean BlockStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (WildIdent|digits) (colon TypeAndToken)?
  public static boolean CIdentType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CIdentType")) return false;
    if (!nextTokenIs(b, "<c ident type>", DIGITS, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_IDENT_TYPE, "<c ident type>");
    r = CIdentType_0(b, l + 1);
    r = r && CIdentType_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WildIdent|digits
  private static boolean CIdentType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CIdentType_0")) return false;
    boolean r;
    r = WildIdent(b, l + 1);
    if (!r) r = consumeToken(b, DIGITS);
    return r;
  }

  // (colon TypeAndToken)?
  private static boolean CIdentType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CIdentType_1")) return false;
    CIdentType_1_0(b, l + 1);
    return true;
  }

  // colon TypeAndToken
  private static boolean CIdentType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CIdentType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // eq (hashtag lbracket Expression rbracket)?
  //      | openAngleBracket
  //      | closeAngleBracket
  //      | darrow
  //      | arrQuest
  //      | assign
  //      | neq
  //      | 'neqAlt'
  //      | '\u2264'
  //      | '\u2265'
  //      | EquivOp
  //      | ImpliesOp
  //      | ExpliesOp
  public static boolean CalcOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_OP, "<calc op>");
    r = CalcOp_0(b, l + 1);
    if (!r) r = consumeToken(b, OPENANGLEBRACKET);
    if (!r) r = consumeToken(b, CLOSEANGLEBRACKET);
    if (!r) r = consumeToken(b, DARROW);
    if (!r) r = consumeToken(b, ARRQUEST);
    if (!r) r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, NEQ);
    if (!r) r = consumeToken(b, "neqAlt");
    if (!r) r = consumeToken(b, "\\u2264");
    if (!r) r = consumeToken(b, "\\u2265");
    if (!r) r = EquivOp(b, l + 1);
    if (!r) r = ImpliesOp(b, l + 1);
    if (!r) r = ExpliesOp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // eq (hashtag lbracket Expression rbracket)?
  private static boolean CalcOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && CalcOp_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (hashtag lbracket Expression rbracket)?
  private static boolean CalcOp_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcOp_0_1")) return false;
    CalcOp_0_1_0(b, l + 1);
    return true;
  }

  // hashtag lbracket Expression rbracket
  private static boolean CalcOp_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcOp_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASHTAG, LBRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // calc ( Attribute)* (CalcOp)? lbrace
  //  (
  //      Expression semi (CalcOp)? (BlockStmt| CalcStmt)*
  //  )*
  //  rbrace
  public static boolean CalcStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt")) return false;
    if (!nextTokenIs(b, CALC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALC);
    r = r && CalcStmt_1(b, l + 1);
    r = r && CalcStmt_2(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && CalcStmt_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, CALC_STMT, r);
    return r;
  }

  // ( Attribute)*
  private static boolean CalcStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CalcStmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CalcStmt_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean CalcStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CalcOp)?
  private static boolean CalcStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_2")) return false;
    CalcStmt_2_0(b, l + 1);
    return true;
  }

  // (CalcOp)
  private static boolean CalcStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CalcOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //      Expression semi (CalcOp)? (BlockStmt| CalcStmt)*
  //  )*
  private static boolean CalcStmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CalcStmt_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CalcStmt_4", c)) break;
    }
    return true;
  }

  // Expression semi (CalcOp)? (BlockStmt| CalcStmt)*
  private static boolean CalcStmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && CalcStmt_4_0_2(b, l + 1);
    r = r && CalcStmt_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CalcOp)?
  private static boolean CalcStmt_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_4_0_2")) return false;
    CalcStmt_4_0_2_0(b, l + 1);
    return true;
  }

  // (CalcOp)
  private static boolean CalcStmt_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CalcOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BlockStmt| CalcStmt)*
  private static boolean CalcStmt_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_4_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CalcStmt_4_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CalcStmt_4_0_3", c)) break;
    }
    return true;
  }

  // BlockStmt| CalcStmt
  private static boolean CalcStmt_4_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CalcStmt_4_0_3_0")) return false;
    boolean r;
    r = BlockStmt(b, l + 1);
    if (!r) r = CalcStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // case (
  //     Ident (openparen (CasePattern (comma CasePattern)*)? closeparen)?
  //      | openparen  CasePattern (comma CasePattern)* closeparen
  //  )
  //  darrow Expression
  public static boolean CaseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && CaseExpression_1(b, l + 1);
    r = r && consumeToken(b, DARROW);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, CASE_EXPRESSION, r);
    return r;
  }

  // Ident (openparen (CasePattern (comma CasePattern)*)? closeparen)?
  //      | openparen  CasePattern (comma CasePattern)* closeparen
  private static boolean CaseExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseExpression_1_0(b, l + 1);
    if (!r) r = CaseExpression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Ident (openparen (CasePattern (comma CasePattern)*)? closeparen)?
  private static boolean CaseExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && CaseExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (openparen (CasePattern (comma CasePattern)*)? closeparen)?
  private static boolean CaseExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0_1")) return false;
    CaseExpression_1_0_1_0(b, l + 1);
    return true;
  }

  // openparen (CasePattern (comma CasePattern)*)? closeparen
  private static boolean CaseExpression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && CaseExpression_1_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CasePattern (comma CasePattern)*)?
  private static boolean CaseExpression_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0_1_0_1")) return false;
    CaseExpression_1_0_1_0_1_0(b, l + 1);
    return true;
  }

  // CasePattern (comma CasePattern)*
  private static boolean CaseExpression_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CasePattern(b, l + 1);
    r = r && CaseExpression_1_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePattern)*
  private static boolean CaseExpression_1_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseExpression_1_0_1_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseExpression_1_0_1_0_1_0_1", c)) break;
    }
    return true;
  }

  // comma CasePattern
  private static boolean CaseExpression_1_0_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_0_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen  CasePattern (comma CasePattern)* closeparen
  private static boolean CaseExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && CasePattern(b, l + 1);
    r = r && CaseExpression_1_1_2(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePattern)*
  private static boolean CaseExpression_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseExpression_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseExpression_1_1_2", c)) break;
    }
    return true;
  }

  // comma CasePattern
  private static boolean CaseExpression_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseExpression_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident openparen (CasePattern (comma CasePattern)* )? closeparen
  //      | openparen (CasePattern (comma CasePattern)* )? closeparen
  //      | IdentTypeOptional
  public static boolean CasePattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern")) return false;
    if (!nextTokenIs(b, "<case pattern>", IDENTDEF, OPENPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_PATTERN, "<case pattern>");
    r = CasePattern_0(b, l + 1);
    if (!r) r = CasePattern_1(b, l + 1);
    if (!r) r = IdentTypeOptional(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Ident openparen (CasePattern (comma CasePattern)* )? closeparen
  private static boolean CasePattern_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && consumeToken(b, OPENPAREN);
    r = r && CasePattern_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CasePattern (comma CasePattern)* )?
  private static boolean CasePattern_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_0_2")) return false;
    CasePattern_0_2_0(b, l + 1);
    return true;
  }

  // CasePattern (comma CasePattern)*
  private static boolean CasePattern_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CasePattern(b, l + 1);
    r = r && CasePattern_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePattern)*
  private static boolean CasePattern_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CasePattern_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CasePattern_0_2_0_1", c)) break;
    }
    return true;
  }

  // comma CasePattern
  private static boolean CasePattern_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen (CasePattern (comma CasePattern)* )? closeparen
  private static boolean CasePattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && CasePattern_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CasePattern (comma CasePattern)* )?
  private static boolean CasePattern_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_1_1")) return false;
    CasePattern_1_1_0(b, l + 1);
    return true;
  }

  // CasePattern (comma CasePattern)*
  private static boolean CasePattern_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CasePattern(b, l + 1);
    r = r && CasePattern_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePattern)*
  private static boolean CasePattern_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CasePattern_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CasePattern_1_1_0_1", c)) break;
    }
    return true;
  }

  // comma CasePattern
  private static boolean CasePattern_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePattern_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident  openparen (CasePatternLocal (comma CasePatternLocal)* )? closeparen
  //      | openparen (CasePatternLocal (comma CasePatternLocal)* )? closeparen
  //      | LocalIdentTypeOptional
  public static boolean CasePatternLocal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal")) return false;
    if (!nextTokenIs(b, "<case pattern local>", IDENTDEF, OPENPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_PATTERN_LOCAL, "<case pattern local>");
    r = CasePatternLocal_0(b, l + 1);
    if (!r) r = CasePatternLocal_1(b, l + 1);
    if (!r) r = LocalIdentTypeOptional(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Ident  openparen (CasePatternLocal (comma CasePatternLocal)* )? closeparen
  private static boolean CasePatternLocal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && consumeToken(b, OPENPAREN);
    r = r && CasePatternLocal_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CasePatternLocal (comma CasePatternLocal)* )?
  private static boolean CasePatternLocal_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_0_2")) return false;
    CasePatternLocal_0_2_0(b, l + 1);
    return true;
  }

  // CasePatternLocal (comma CasePatternLocal)*
  private static boolean CasePatternLocal_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CasePatternLocal(b, l + 1);
    r = r && CasePatternLocal_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePatternLocal)*
  private static boolean CasePatternLocal_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CasePatternLocal_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CasePatternLocal_0_2_0_1", c)) break;
    }
    return true;
  }

  // comma CasePatternLocal
  private static boolean CasePatternLocal_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePatternLocal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen (CasePatternLocal (comma CasePatternLocal)* )? closeparen
  private static boolean CasePatternLocal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && CasePatternLocal_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CasePatternLocal (comma CasePatternLocal)* )?
  private static boolean CasePatternLocal_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_1_1")) return false;
    CasePatternLocal_1_1_0(b, l + 1);
    return true;
  }

  // CasePatternLocal (comma CasePatternLocal)*
  private static boolean CasePatternLocal_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CasePatternLocal(b, l + 1);
    r = r && CasePatternLocal_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePatternLocal)*
  private static boolean CasePatternLocal_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CasePatternLocal_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CasePatternLocal_1_1_0_1", c)) break;
    }
    return true;
  }

  // comma CasePatternLocal
  private static boolean CasePatternLocal_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CasePatternLocal_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePatternLocal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // case
  //  (
  //     Ident (openparen (CasePattern (comma CasePattern)* )? closeparen)?
  //     | openparen CasePattern (comma CasePattern )* closeparen
  //  )
  //  darrow (Stmt)*
  public static boolean CaseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && CaseStatement_1(b, l + 1);
    r = r && consumeToken(b, DARROW);
    r = r && CaseStatement_3(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT, r);
    return r;
  }

  // Ident (openparen (CasePattern (comma CasePattern)* )? closeparen)?
  //     | openparen CasePattern (comma CasePattern )* closeparen
  private static boolean CaseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseStatement_1_0(b, l + 1);
    if (!r) r = CaseStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Ident (openparen (CasePattern (comma CasePattern)* )? closeparen)?
  private static boolean CaseStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && CaseStatement_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (openparen (CasePattern (comma CasePattern)* )? closeparen)?
  private static boolean CaseStatement_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_0_1")) return false;
    CaseStatement_1_0_1_0(b, l + 1);
    return true;
  }

  // openparen (CasePattern (comma CasePattern)* )? closeparen
  private static boolean CaseStatement_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && CaseStatement_1_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CasePattern (comma CasePattern)* )?
  private static boolean CaseStatement_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_0_1_0_1")) return false;
    CaseStatement_1_0_1_0_1_0(b, l + 1);
    return true;
  }

  // CasePattern (comma CasePattern)*
  private static boolean CaseStatement_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CasePattern(b, l + 1);
    r = r && CaseStatement_1_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePattern)*
  private static boolean CaseStatement_1_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_0_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseStatement_1_0_1_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStatement_1_0_1_0_1_0_1", c)) break;
    }
    return true;
  }

  // comma CasePattern
  private static boolean CaseStatement_1_0_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_0_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen CasePattern (comma CasePattern )* closeparen
  private static boolean CaseStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && CasePattern(b, l + 1);
    r = r && CaseStatement_1_1_2(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma CasePattern )*
  private static boolean CaseStatement_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseStatement_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStatement_1_1_2", c)) break;
    }
    return true;
  }

  // comma CasePattern
  private static boolean CaseStatement_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Stmt)*
  private static boolean CaseStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CaseStatement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CaseStatement_3", c)) break;
    }
    return true;
  }

  // (Stmt)
  private static boolean CaseStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CaseStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // classToken (Attribute)* NoUSIdent (GenericParameters)?
  //  (
  //     extends TypeAndToken (comma TypeAndToken )*
  //   )?
  //   lbrace
  //  ( (DeclModifier)* ClassMemberDecl)* rbrace
  public static boolean ClassDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl")) return false;
    if (!nextTokenIs(b, CLASSTOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASSTOKEN);
    r = r && ClassDecl_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && ClassDecl_3(b, l + 1);
    r = r && ClassDecl_4(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ClassDecl_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, CLASS_DECL, r);
    return r;
  }

  // (Attribute)*
  private static boolean ClassDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean ClassDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean ClassDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_3")) return false;
    ClassDecl_3_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean ClassDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //     extends TypeAndToken (comma TypeAndToken )*
  //   )?
  private static boolean ClassDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_4")) return false;
    ClassDecl_4_0(b, l + 1);
    return true;
  }

  // extends TypeAndToken (comma TypeAndToken )*
  private static boolean ClassDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && TypeAndToken(b, l + 1);
    r = r && ClassDecl_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma TypeAndToken )*
  private static boolean ClassDecl_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_4_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassDecl_4_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDecl_4_0_2", c)) break;
    }
    return true;
  }

  // comma TypeAndToken
  private static boolean ClassDecl_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( (DeclModifier)* ClassMemberDecl)*
  private static boolean ClassDecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassDecl_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDecl_6", c)) break;
    }
    return true;
  }

  // (DeclModifier)* ClassMemberDecl
  private static boolean ClassDecl_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ClassDecl_6_0_0(b, l + 1);
    r = r && ClassMemberDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DeclModifier)*
  private static boolean ClassDecl_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_6_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ClassDecl_6_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ClassDecl_6_0_0", c)) break;
    }
    return true;
  }

  // (DeclModifier)
  private static boolean ClassDecl_6_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassDecl_6_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclModifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FieldDecl
  //      | ConstantFieldDecl
  //      | FunctionDecl
  //      | MethodDecl
  public static boolean ClassMemberDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassMemberDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBER_DECL, "<class member decl>");
    r = FieldDecl(b, l + 1);
    if (!r) r = ConstantFieldDecl(b, l + 1);
    if (!r) r = FunctionDecl(b, l + 1);
    if (!r) r = MethodDecl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // false
  //      | true
  //      | null
  //      | Nat
  //      | Dec
  //      | charToken
  //      | stringToken
  //      | this
  //      | fresh openparen Expression closeparen
  //      | allocated openparen Expression closeparen
  //      | unchanged (at LabelIdent)? openparen FrameExpression (comma FrameExpression)* closeparen
  //      | old (at LabelIdent)? openparen Expression closeparen
  //      | verticalbar  Expression verticalbar
  //      | ( int | real) openparen Expression closeparen
  //      | ParensExpression
  public static boolean ConstAtomExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_ATOM_EXPRESSION, "<const atom expression>");
    r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = Nat(b, l + 1);
    if (!r) r = Dec(b, l + 1);
    if (!r) r = consumeToken(b, CHARTOKEN);
    if (!r) r = consumeToken(b, STRINGTOKEN);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = ConstAtomExpression_8(b, l + 1);
    if (!r) r = ConstAtomExpression_9(b, l + 1);
    if (!r) r = ConstAtomExpression_10(b, l + 1);
    if (!r) r = ConstAtomExpression_11(b, l + 1);
    if (!r) r = ConstAtomExpression_12(b, l + 1);
    if (!r) r = ConstAtomExpression_13(b, l + 1);
    if (!r) r = ParensExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // fresh openparen Expression closeparen
  private static boolean ConstAtomExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FRESH, OPENPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // allocated openparen Expression closeparen
  private static boolean ConstAtomExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALLOCATED, OPENPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // unchanged (at LabelIdent)? openparen FrameExpression (comma FrameExpression)* closeparen
  private static boolean ConstAtomExpression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNCHANGED);
    r = r && ConstAtomExpression_10_1(b, l + 1);
    r = r && consumeToken(b, OPENPAREN);
    r = r && FrameExpression(b, l + 1);
    r = r && ConstAtomExpression_10_4(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (at LabelIdent)?
  private static boolean ConstAtomExpression_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_10_1")) return false;
    ConstAtomExpression_10_1_0(b, l + 1);
    return true;
  }

  // at LabelIdent
  private static boolean ConstAtomExpression_10_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_10_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && LabelIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma FrameExpression)*
  private static boolean ConstAtomExpression_10_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_10_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConstAtomExpression_10_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConstAtomExpression_10_4", c)) break;
    }
    return true;
  }

  // comma FrameExpression
  private static boolean ConstAtomExpression_10_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_10_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // old (at LabelIdent)? openparen Expression closeparen
  private static boolean ConstAtomExpression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OLD);
    r = r && ConstAtomExpression_11_1(b, l + 1);
    r = r && consumeToken(b, OPENPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (at LabelIdent)?
  private static boolean ConstAtomExpression_11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_11_1")) return false;
    ConstAtomExpression_11_1_0(b, l + 1);
    return true;
  }

  // at LabelIdent
  private static boolean ConstAtomExpression_11_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_11_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && LabelIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // verticalbar  Expression verticalbar
  private static boolean ConstAtomExpression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERTICALBAR);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, VERTICALBAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( int | real) openparen Expression closeparen
  private static boolean ConstAtomExpression_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstAtomExpression_13_0(b, l + 1);
    r = r && consumeToken(b, OPENPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // int | real
  private static boolean ConstAtomExpression_13_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstAtomExpression_13_0")) return false;
    boolean r;
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, REAL);
    return r;
  }

  /* ********************************************************** */
  // const (Attribute)* CIdentType (gets Expression)? OldSemi
  public static boolean ConstantFieldDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantFieldDecl")) return false;
    if (!nextTokenIs(b, CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST);
    r = r && ConstantFieldDecl_1(b, l + 1);
    r = r && CIdentType(b, l + 1);
    r = r && ConstantFieldDecl_3(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, CONSTANT_FIELD_DECL, r);
    return r;
  }

  // (Attribute)*
  private static boolean ConstantFieldDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantFieldDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ConstantFieldDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ConstantFieldDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean ConstantFieldDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantFieldDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (gets Expression)?
  private static boolean ConstantFieldDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantFieldDecl_3")) return false;
    ConstantFieldDecl_3_0(b, l + 1);
    return true;
  }

  // gets Expression
  private static boolean ConstantFieldDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ConstantFieldDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (include stringToken
  //  )* (TopDecl)*
  //  EOF
  static boolean Dafny(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Dafny_0(b, l + 1);
    r = r && Dafny_1(b, l + 1);
    r = r && consumeToken(b, EOF);
    exit_section_(b, m, null, r);
    return r;
  }

  // (include stringToken
  //  )*
  private static boolean Dafny_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Dafny_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Dafny_0", c)) break;
    }
    return true;
  }

  // include stringToken
  private static boolean Dafny_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INCLUDE, STRINGTOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TopDecl)*
  private static boolean Dafny_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Dafny_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Dafny_1", c)) break;
    }
    return true;
  }

  // (TopDecl)
  private static boolean Dafny_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dafny_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TopDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //     datatype
  //     | codatatype
  //  )
  //  (Attribute)* NoUSIdent (GenericParameters)? assign (verticalbar)? DatatypeMemberDecl (verticalbar DatatypeMemberDecl)* (semi)?
  public static boolean DatatypeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl")) return false;
    if (!nextTokenIs(b, "<datatype decl>", CODATATYPE, DATATYPE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATATYPE_DECL, "<datatype decl>");
    r = DatatypeDecl_0(b, l + 1);
    r = r && DatatypeDecl_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && DatatypeDecl_3(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && DatatypeDecl_5(b, l + 1);
    r = r && DatatypeMemberDecl(b, l + 1);
    r = r && DatatypeDecl_7(b, l + 1);
    r = r && DatatypeDecl_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // datatype
  //     | codatatype
  private static boolean DatatypeDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_0")) return false;
    boolean r;
    r = consumeToken(b, DATATYPE);
    if (!r) r = consumeToken(b, CODATATYPE);
    return r;
  }

  // (Attribute)*
  private static boolean DatatypeDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DatatypeDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DatatypeDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean DatatypeDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean DatatypeDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_3")) return false;
    DatatypeDecl_3_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean DatatypeDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (verticalbar)?
  private static boolean DatatypeDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_5")) return false;
    consumeToken(b, VERTICALBAR);
    return true;
  }

  // (verticalbar DatatypeMemberDecl)*
  private static boolean DatatypeDecl_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DatatypeDecl_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DatatypeDecl_7", c)) break;
    }
    return true;
  }

  // verticalbar DatatypeMemberDecl
  private static boolean DatatypeDecl_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERTICALBAR);
    r = r && DatatypeMemberDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (semi)?
  private static boolean DatatypeDecl_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeDecl_8")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // (Attribute)* NoUSIdent (FormalsOptionalIds)?
  public static boolean DatatypeMemberDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl")) return false;
    if (!nextTokenIs(b, "<datatype member decl>", IDENTDEF, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATATYPE_MEMBER_DECL, "<datatype member decl>");
    r = DatatypeMemberDecl_0(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && DatatypeMemberDecl_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Attribute)*
  private static boolean DatatypeMemberDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DatatypeMemberDecl_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DatatypeMemberDecl_0", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean DatatypeMemberDecl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (FormalsOptionalIds)?
  private static boolean DatatypeMemberDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_2")) return false;
    DatatypeMemberDecl_2_0(b, l + 1);
    return true;
  }

  // (FormalsOptionalIds)
  private static boolean DatatypeMemberDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DatatypeMemberDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FormalsOptionalIds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (decimaldigits)
  public static boolean Dec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Dec")) return false;
    if (!nextTokenIs(b, DECIMALDIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECIMALDIGITS);
    exit_section_(b, m, DEC, r);
    return r;
  }

  /* ********************************************************** */
  // abstract
  //  | ghost
  //  | static
  //  | protected
  public static boolean DeclModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclModifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_MODIFIER, "<decl modifier>");
    r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, GHOST);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, PROTECTED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PossiblyWildExpression (comma PossiblyWildExpression)*
  public static boolean DecreasesList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecreasesList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECREASES_LIST, "<decreases list>");
    r = PossiblyWildExpression(b, l + 1);
    r = r && DecreasesList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma PossiblyWildExpression)*
  private static boolean DecreasesList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecreasesList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecreasesList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DecreasesList_1", c)) break;
    }
    return true;
  }

  // comma PossiblyWildExpression
  private static boolean DecreasesList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecreasesList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && PossiblyWildExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lbrace (Expressions)? rbrace
  //      | lbracket (Expressions)? rbracket
  public static boolean DisplayExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayExpr")) return false;
    if (!nextTokenIs(b, "<display expr>", LBRACE, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_EXPR, "<display expr>");
    r = DisplayExpr_0(b, l + 1);
    if (!r) r = DisplayExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lbrace (Expressions)? rbrace
  private static boolean DisplayExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && DisplayExpr_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean DisplayExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayExpr_0_1")) return false;
    DisplayExpr_0_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean DisplayExpr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayExpr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lbracket (Expressions)? rbracket
  private static boolean DisplayExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && DisplayExpr_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean DisplayExpr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayExpr_1_1")) return false;
    DisplayExpr_1_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean DisplayExpr_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DisplayExpr_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lbrace (Stmt)* (new semi (Stmt)* )? rbrace
  public static boolean DividedBlockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DividedBlockStmt")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && DividedBlockStmt_1(b, l + 1);
    r = r && DividedBlockStmt_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, DIVIDED_BLOCK_STMT, r);
    return r;
  }

  // (Stmt)*
  private static boolean DividedBlockStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DividedBlockStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DividedBlockStmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DividedBlockStmt_1", c)) break;
    }
    return true;
  }

  // (Stmt)
  private static boolean DividedBlockStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DividedBlockStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (new semi (Stmt)* )?
  private static boolean DividedBlockStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DividedBlockStmt_2")) return false;
    DividedBlockStmt_2_0(b, l + 1);
    return true;
  }

  // new semi (Stmt)*
  private static boolean DividedBlockStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DividedBlockStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NEW, SEMI);
    r = r && DividedBlockStmt_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Stmt)*
  private static boolean DividedBlockStmt_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DividedBlockStmt_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DividedBlockStmt_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DividedBlockStmt_2_0_2", c)) break;
    }
    return true;
  }

  // (Stmt)
  private static boolean DividedBlockStmt_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DividedBlockStmt_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identdef
  //      | digits
  //      | decimaldigits
  //      | requires
  //      | reads
  public static boolean DotSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DotSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT_SUFFIX, "<dot suffix>");
    r = consumeToken(b, IDENTDEF);
    if (!r) r = consumeToken(b, DIGITS);
    if (!r) r = consumeToken(b, DECIMALDIGITS);
    if (!r) r = consumeToken(b, REQUIRES);
    if (!r) r = consumeToken(b, READS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if (ExistentialGuard | Expression) then Expression else Expression
  //      | MatchExpression
  //      | QuantifierGuts
  //      | set SetComprehensionExpr
  //      | iset SetComprehensionExpr
  //      | StmtInExpr Expression
  //      | LetExpr
  //      | map  MapComprehensionExpr
  //      | imap MapComprehensionExpr
  //      | reveal Expression
  //      | NamedExpr
  public static boolean EndlessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENDLESS_EXPRESSION, "<endless expression>");
    r = EndlessExpression_0(b, l + 1);
    if (!r) r = MatchExpression(b, l + 1);
    if (!r) r = QuantifierGuts(b, l + 1);
    if (!r) r = EndlessExpression_3(b, l + 1);
    if (!r) r = EndlessExpression_4(b, l + 1);
    if (!r) r = EndlessExpression_5(b, l + 1);
    if (!r) r = LetExpr(b, l + 1);
    if (!r) r = EndlessExpression_7(b, l + 1);
    if (!r) r = EndlessExpression_8(b, l + 1);
    if (!r) r = EndlessExpression_9(b, l + 1);
    if (!r) r = NamedExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // if (ExistentialGuard | Expression) then Expression else Expression
  private static boolean EndlessExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && EndlessExpression_0_1(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExistentialGuard | Expression
  private static boolean EndlessExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_0_1")) return false;
    boolean r;
    r = ExistentialGuard(b, l + 1);
    if (!r) r = Expression(b, l + 1);
    return r;
  }

  // set SetComprehensionExpr
  private static boolean EndlessExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && SetComprehensionExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // iset SetComprehensionExpr
  private static boolean EndlessExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ISET);
    r = r && SetComprehensionExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // StmtInExpr Expression
  private static boolean EndlessExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = StmtInExpr(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // map  MapComprehensionExpr
  private static boolean EndlessExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAP);
    r = r && MapComprehensionExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // imap MapComprehensionExpr
  private static boolean EndlessExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMAP);
    r = r && MapComprehensionExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // reveal Expression
  private static boolean EndlessExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EndlessExpression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REVEAL);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ImpliesExpliesExpression (EquivOp ImpliesExpliesExpression)*
  public static boolean EquivExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUIV_EXPRESSION, "<equiv expression>");
    r = ImpliesExpliesExpression(b, l + 1);
    r = r && EquivExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (EquivOp ImpliesExpliesExpression)*
  private static boolean EquivExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EquivExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EquivExpression_1", c)) break;
    }
    return true;
  }

  // EquivOp ImpliesExpliesExpression
  private static boolean EquivExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EquivOp(b, l + 1);
    r = r && ImpliesExpliesExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // equivalentTo | '\u21d4'
  public static boolean EquivOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EquivOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUIV_OP, "<equiv op>");
    r = consumeToken(b, EQUIVALENTTO);
    if (!r) r = consumeToken(b, "\\u21d4");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IdentTypeOptional (comma IdentTypeOptional)* (Attribute)* boredSmiley Expression
  public static boolean ExistentialGuard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExistentialGuard")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentTypeOptional(b, l + 1);
    r = r && ExistentialGuard_1(b, l + 1);
    r = r && ExistentialGuard_2(b, l + 1);
    r = r && consumeToken(b, BOREDSMILEY);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, EXISTENTIAL_GUARD, r);
    return r;
  }

  // (comma IdentTypeOptional)*
  private static boolean ExistentialGuard_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExistentialGuard_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExistentialGuard_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExistentialGuard_1", c)) break;
    }
    return true;
  }

  // comma IdentTypeOptional
  private static boolean ExistentialGuard_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExistentialGuard_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && IdentTypeOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean ExistentialGuard_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExistentialGuard_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExistentialGuard_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExistentialGuard_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean ExistentialGuard_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExistentialGuard_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // existstoken | '\u2203'
  public static boolean Exists(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exists")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXISTS, "<exists>");
    r = consumeToken(b, EXISTSTOKEN);
    if (!r) r = consumeToken(b, "\\u2203");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // implyLeft | '\u21d0'
  public static boolean ExpliesOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpliesOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPLIES_OP, "<explies op>");
    r = consumeToken(b, IMPLYLEFT);
    if (!r) r = consumeToken(b, "\\u21d0");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EquivExpression (semi Expression)?
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = EquivExpression(b, l + 1);
    r = r && Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (semi Expression)?
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    Expression_1_0(b, l + 1);
    return true;
  }

  // semi Expression
  private static boolean Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression (comma Expression)*
  public static boolean Expressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expressions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSIONS, "<expressions>");
    r = Expression(b, l + 1);
    r = r && Expressions_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma Expression)*
  private static boolean Expressions_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expressions_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expressions_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expressions_1", c)) break;
    }
    return true;
  }

  // comma Expression
  private static boolean Expressions_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expressions_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( WildIdent|digits) colon TypeAndToken
  public static boolean FIdentType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FIdentType")) return false;
    if (!nextTokenIs(b, "<f ident type>", DIGITS, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, F_IDENT_TYPE, "<f ident type>");
    r = FIdentType_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WildIdent|digits
  private static boolean FIdentType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FIdentType_0")) return false;
    boolean r;
    r = WildIdent(b, l + 1);
    if (!r) r = consumeToken(b, DIGITS);
    return r;
  }

  /* ********************************************************** */
  // BitvectorFactor (MulOp BitvectorFactor)*
  public static boolean Factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = BitvectorFactor(b, l + 1);
    r = r && Factor_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (MulOp BitvectorFactor)*
  private static boolean Factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Factor_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Factor_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Factor_1", c)) break;
    }
    return true;
  }

  // MulOp BitvectorFactor
  private static boolean Factor_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Factor_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MulOp(b, l + 1);
    r = r && BitvectorFactor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var (Attribute)* FIdentType (comma FIdentType)* OldSemi
  public static boolean FieldDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VAR);
    r = r && FieldDecl_1(b, l + 1);
    r = r && FIdentType(b, l + 1);
    r = r && FieldDecl_3(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, FIELD_DECL, r);
    return r;
  }

  // (Attribute)*
  private static boolean FieldDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FieldDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FieldDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean FieldDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma FIdentType)*
  private static boolean FieldDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FieldDecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FieldDecl_3", c)) break;
    }
    return true;
  }

  // comma FIdentType
  private static boolean FieldDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FIdentType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // foralltoken | '\u2200'
  public static boolean Forall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Forall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORALL, "<forall>");
    r = consumeToken(b, FORALLTOKEN);
    if (!r) r = consumeToken(b, "\\u2200");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (foralltoken | parallel)
  //  (openparen(QuantifierDomain)?closeparen| (QuantifierDomain)?)
  //  ((free)? ensures Expression OldSemi)* (BlockStmt)?
  public static boolean ForallStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt")) return false;
    if (!nextTokenIs(b, "<forall stmt>", FORALLTOKEN, PARALLEL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORALL_STMT, "<forall stmt>");
    r = ForallStmt_0(b, l + 1);
    r = r && ForallStmt_1(b, l + 1);
    r = r && ForallStmt_2(b, l + 1);
    r = r && ForallStmt_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // foralltoken | parallel
  private static boolean ForallStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_0")) return false;
    boolean r;
    r = consumeToken(b, FORALLTOKEN);
    if (!r) r = consumeToken(b, PARALLEL);
    return r;
  }

  // openparen(QuantifierDomain)?closeparen| (QuantifierDomain)?
  private static boolean ForallStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForallStmt_1_0(b, l + 1);
    if (!r) r = ForallStmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen(QuantifierDomain)?closeparen
  private static boolean ForallStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && ForallStmt_1_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (QuantifierDomain)?
  private static boolean ForallStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_1_0_1")) return false;
    ForallStmt_1_0_1_0(b, l + 1);
    return true;
  }

  // (QuantifierDomain)
  private static boolean ForallStmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QuantifierDomain(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (QuantifierDomain)?
  private static boolean ForallStmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_1_1")) return false;
    ForallStmt_1_1_0(b, l + 1);
    return true;
  }

  // (QuantifierDomain)
  private static boolean ForallStmt_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QuantifierDomain(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((free)? ensures Expression OldSemi)*
  private static boolean ForallStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ForallStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForallStmt_2", c)) break;
    }
    return true;
  }

  // (free)? ensures Expression OldSemi
  private static boolean ForallStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForallStmt_2_0_0(b, l + 1);
    r = r && consumeToken(b, ENSURES);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (free)?
  private static boolean ForallStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_2_0_0")) return false;
    consumeToken(b, FREE);
    return true;
  }

  // (BlockStmt)?
  private static boolean ForallStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_3")) return false;
    ForallStmt_3_0(b, l + 1);
    return true;
  }

  // (BlockStmt)
  private static boolean ForallStmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForallStmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // openparen (GIdentType (comma GIdentType)* )? closeparen
  public static boolean Formals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals")) return false;
    if (!nextTokenIs(b, OPENPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && Formals_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, FORMALS, r);
    return r;
  }

  // (GIdentType (comma GIdentType)* )?
  private static boolean Formals_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1")) return false;
    Formals_1_0(b, l + 1);
    return true;
  }

  // GIdentType (comma GIdentType)*
  private static boolean Formals_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GIdentType(b, l + 1);
    r = r && Formals_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma GIdentType)*
  private static boolean Formals_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Formals_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Formals_1_0_1", c)) break;
    }
    return true;
  }

  // comma GIdentType
  private static boolean Formals_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Formals_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && GIdentType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // openparen (TypeIdentOptional (comma TypeIdentOptional)* )? closeparen
  public static boolean FormalsOptionalIds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds")) return false;
    if (!nextTokenIs(b, OPENPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && FormalsOptionalIds_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, FORMALS_OPTIONAL_IDS, r);
    return r;
  }

  // (TypeIdentOptional (comma TypeIdentOptional)* )?
  private static boolean FormalsOptionalIds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1")) return false;
    FormalsOptionalIds_1_0(b, l + 1);
    return true;
  }

  // TypeIdentOptional (comma TypeIdentOptional)*
  private static boolean FormalsOptionalIds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeIdentOptional(b, l + 1);
    r = r && FormalsOptionalIds_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma TypeIdentOptional)*
  private static boolean FormalsOptionalIds_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FormalsOptionalIds_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FormalsOptionalIds_1_0_1", c)) break;
    }
    return true;
  }

  // comma TypeIdentOptional
  private static boolean FormalsOptionalIds_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormalsOptionalIds_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeIdentOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression(backtick Ident)? | backtick Ident
  public static boolean FrameExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FRAME_EXPRESSION, "<frame expression>");
    r = FrameExpression_0(b, l + 1);
    if (!r) r = FrameExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Expression(backtick Ident)?
  private static boolean FrameExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && FrameExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (backtick Ident)?
  private static boolean FrameExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression_0_1")) return false;
    FrameExpression_0_1_0(b, l + 1);
    return true;
  }

  // backtick Ident
  private static boolean FrameExpression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACKTICK);
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // backtick Ident
  private static boolean FrameExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FrameExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACKTICK);
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NoUSIdent | digits
  public static boolean FuMe_Ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FuMe_Ident")) return false;
    if (!nextTokenIs(b, "<fu me ident>", DIGITS, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FU_ME_IDENT, "<fu me ident>");
    r = NoUSIdent(b, l + 1);
    if (!r) r = consumeToken(b, DIGITS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lbrace Expression rbrace
  public static boolean FunctionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, FUNCTION_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // (twostate)? (
  //      function (method)? (Attribute)* FuMe_Ident
  //      (
  //          (GenericParameters)? Formals colon
  //          (
  //              openparen GIdentType closeparen | TypeAndToken
  //          )
  //          | ellipsis
  //      )
  //      | predicate (method)? (Attribute)* NoUSIdent
  //      (
  //          ellipsis
  //          |(GenericParameters)? (Formals)? (colon)?
  //      )
  //      |
  //      inductive predicate (Attribute)* FuMe_Ident
  //      (
  //          (GenericParameters)? (KType)? Formals (colon)?
  //          | ellipsis
  //      )
  //      |
  //      copredicate (Attribute)* NoUSIdent
  //      (
  //          (GenericParameters)? (KType)? Formals(colon)?
  //          | ellipsis
  //      )
  //  ) (FunctionSpec)* (FunctionBody)?
  public static boolean FunctionDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECL, "<function decl>");
    r = FunctionDecl_0(b, l + 1);
    r = r && FunctionDecl_1(b, l + 1);
    r = r && FunctionDecl_2(b, l + 1);
    r = r && FunctionDecl_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (twostate)?
  private static boolean FunctionDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_0")) return false;
    consumeToken(b, TWOSTATE);
    return true;
  }

  // function (method)? (Attribute)* FuMe_Ident
  //      (
  //          (GenericParameters)? Formals colon
  //          (
  //              openparen GIdentType closeparen | TypeAndToken
  //          )
  //          | ellipsis
  //      )
  //      | predicate (method)? (Attribute)* NoUSIdent
  //      (
  //          ellipsis
  //          |(GenericParameters)? (Formals)? (colon)?
  //      )
  //      |
  //      inductive predicate (Attribute)* FuMe_Ident
  //      (
  //          (GenericParameters)? (KType)? Formals (colon)?
  //          | ellipsis
  //      )
  //      |
  //      copredicate (Attribute)* NoUSIdent
  //      (
  //          (GenericParameters)? (KType)? Formals(colon)?
  //          | ellipsis
  //      )
  private static boolean FunctionDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_0(b, l + 1);
    if (!r) r = FunctionDecl_1_1(b, l + 1);
    if (!r) r = FunctionDecl_1_2(b, l + 1);
    if (!r) r = FunctionDecl_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function (method)? (Attribute)* FuMe_Ident
  //      (
  //          (GenericParameters)? Formals colon
  //          (
  //              openparen GIdentType closeparen | TypeAndToken
  //          )
  //          | ellipsis
  //      )
  private static boolean FunctionDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION);
    r = r && FunctionDecl_1_0_1(b, l + 1);
    r = r && FunctionDecl_1_0_2(b, l + 1);
    r = r && FuMe_Ident(b, l + 1);
    r = r && FunctionDecl_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (method)?
  private static boolean FunctionDecl_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_1")) return false;
    consumeToken(b, METHOD);
    return true;
  }

  // (Attribute)*
  private static boolean FunctionDecl_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_1_0_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean FunctionDecl_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? Formals colon
  //          (
  //              openparen GIdentType closeparen | TypeAndToken
  //          )
  //          | ellipsis
  private static boolean FunctionDecl_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_0_4_0(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? Formals colon
  //          (
  //              openparen GIdentType closeparen | TypeAndToken
  //          )
  private static boolean FunctionDecl_1_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_0_4_0_0(b, l + 1);
    r = r && Formals(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && FunctionDecl_1_0_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean FunctionDecl_1_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_4_0_0")) return false;
    FunctionDecl_1_0_4_0_0_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean FunctionDecl_1_0_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen GIdentType closeparen | TypeAndToken
  private static boolean FunctionDecl_1_0_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_4_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_0_4_0_3_0(b, l + 1);
    if (!r) r = TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen GIdentType closeparen
  private static boolean FunctionDecl_1_0_4_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_0_4_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && GIdentType(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // predicate (method)? (Attribute)* NoUSIdent
  //      (
  //          ellipsis
  //          |(GenericParameters)? (Formals)? (colon)?
  //      )
  private static boolean FunctionDecl_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PREDICATE);
    r = r && FunctionDecl_1_1_1(b, l + 1);
    r = r && FunctionDecl_1_1_2(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && FunctionDecl_1_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (method)?
  private static boolean FunctionDecl_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_1")) return false;
    consumeToken(b, METHOD);
    return true;
  }

  // (Attribute)*
  private static boolean FunctionDecl_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_1_1_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean FunctionDecl_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ellipsis
  //          |(GenericParameters)? (Formals)? (colon)?
  private static boolean FunctionDecl_1_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    if (!r) r = FunctionDecl_1_1_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? (Formals)? (colon)?
  private static boolean FunctionDecl_1_1_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_1_4_1_0(b, l + 1);
    r = r && FunctionDecl_1_1_4_1_1(b, l + 1);
    r = r && FunctionDecl_1_1_4_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean FunctionDecl_1_1_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_4_1_0")) return false;
    FunctionDecl_1_1_4_1_0_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean FunctionDecl_1_1_4_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_4_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Formals)?
  private static boolean FunctionDecl_1_1_4_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_4_1_1")) return false;
    FunctionDecl_1_1_4_1_1_0(b, l + 1);
    return true;
  }

  // (Formals)
  private static boolean FunctionDecl_1_1_4_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_4_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Formals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon)?
  private static boolean FunctionDecl_1_1_4_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_1_4_1_2")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // inductive predicate (Attribute)* FuMe_Ident
  //      (
  //          (GenericParameters)? (KType)? Formals (colon)?
  //          | ellipsis
  //      )
  private static boolean FunctionDecl_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INDUCTIVE, PREDICATE);
    r = r && FunctionDecl_1_2_2(b, l + 1);
    r = r && FuMe_Ident(b, l + 1);
    r = r && FunctionDecl_1_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean FunctionDecl_1_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_1_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_1_2_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean FunctionDecl_1_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? (KType)? Formals (colon)?
  //          | ellipsis
  private static boolean FunctionDecl_1_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_2_4_0(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? (KType)? Formals (colon)?
  private static boolean FunctionDecl_1_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_2_4_0_0(b, l + 1);
    r = r && FunctionDecl_1_2_4_0_1(b, l + 1);
    r = r && Formals(b, l + 1);
    r = r && FunctionDecl_1_2_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean FunctionDecl_1_2_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_4_0_0")) return false;
    FunctionDecl_1_2_4_0_0_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean FunctionDecl_1_2_4_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_4_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KType)?
  private static boolean FunctionDecl_1_2_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_4_0_1")) return false;
    FunctionDecl_1_2_4_0_1_0(b, l + 1);
    return true;
  }

  // (KType)
  private static boolean FunctionDecl_1_2_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon)?
  private static boolean FunctionDecl_1_2_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_2_4_0_3")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // copredicate (Attribute)* NoUSIdent
  //      (
  //          (GenericParameters)? (KType)? Formals(colon)?
  //          | ellipsis
  //      )
  private static boolean FunctionDecl_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COPREDICATE);
    r = r && FunctionDecl_1_3_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && FunctionDecl_1_3_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean FunctionDecl_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_1_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_1_3_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean FunctionDecl_1_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? (KType)? Formals(colon)?
  //          | ellipsis
  private static boolean FunctionDecl_1_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_3_3_0(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? (KType)? Formals(colon)?
  private static boolean FunctionDecl_1_3_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionDecl_1_3_3_0_0(b, l + 1);
    r = r && FunctionDecl_1_3_3_0_1(b, l + 1);
    r = r && Formals(b, l + 1);
    r = r && FunctionDecl_1_3_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean FunctionDecl_1_3_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_3_0_0")) return false;
    FunctionDecl_1_3_3_0_0_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean FunctionDecl_1_3_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KType)?
  private static boolean FunctionDecl_1_3_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_3_0_1")) return false;
    FunctionDecl_1_3_3_0_1_0(b, l + 1);
    return true;
  }

  // (KType)
  private static boolean FunctionDecl_1_3_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon)?
  private static boolean FunctionDecl_1_3_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_1_3_3_0_3")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // (FunctionSpec)*
  private static boolean FunctionDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionDecl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionDecl_2", c)) break;
    }
    return true;
  }

  // (FunctionSpec)
  private static boolean FunctionDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (FunctionBody)?
  private static boolean FunctionDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_3")) return false;
    FunctionDecl_3_0(b, l + 1);
    return true;
  }

  // (FunctionBody)
  private static boolean FunctionDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FunctionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // requires (Attribute)* Expression OldSemi
  //      | reads PossiblyWildFrameExpression (comma PossiblyWildFrameExpression)* OldSemi
  //      | ensures (Attribute)* Expression OldSemi
  //      | decreases DecreasesList OldSemi
  public static boolean FunctionSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_SPEC, "<function spec>");
    r = FunctionSpec_0(b, l + 1);
    if (!r) r = FunctionSpec_1(b, l + 1);
    if (!r) r = FunctionSpec_2(b, l + 1);
    if (!r) r = FunctionSpec_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // requires (Attribute)* Expression OldSemi
  private static boolean FunctionSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUIRES);
    r = r && FunctionSpec_0_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean FunctionSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionSpec_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionSpec_0_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean FunctionSpec_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // reads PossiblyWildFrameExpression (comma PossiblyWildFrameExpression)* OldSemi
  private static boolean FunctionSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READS);
    r = r && PossiblyWildFrameExpression(b, l + 1);
    r = r && FunctionSpec_1_2(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma PossiblyWildFrameExpression)*
  private static boolean FunctionSpec_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionSpec_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionSpec_1_2", c)) break;
    }
    return true;
  }

  // comma PossiblyWildFrameExpression
  private static boolean FunctionSpec_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && PossiblyWildFrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ensures (Attribute)* Expression OldSemi
  private static boolean FunctionSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENSURES);
    r = r && FunctionSpec_2_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean FunctionSpec_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FunctionSpec_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FunctionSpec_2_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean FunctionSpec_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decreases DecreasesList OldSemi
  private static boolean FunctionSpec_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FunctionSpec_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECREASES);
    r = r && DecreasesList(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ghostd | new)* IdentType
  public static boolean GIdentType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GIdentType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_IDENT_TYPE, "<g ident type>");
    r = GIdentType_0(b, l + 1);
    r = r && IdentType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ghostd | new)*
  private static boolean GIdentType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GIdentType_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GIdentType_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GIdentType_0", c)) break;
    }
    return true;
  }

  // ghostd | new
  private static boolean GIdentType_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GIdentType_0_0")) return false;
    boolean r;
    r = consumeToken(b, GHOSTD);
    if (!r) r = consumeToken(b, NEW);
    return r;
  }

  /* ********************************************************** */
  // openAngleBracket TypeAndToken ( comma TypeAndToken)*closeAngleBracket
  public static boolean GenericInstantiation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInstantiation")) return false;
    if (!nextTokenIs(b, OPENANGLEBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENANGLEBRACKET);
    r = r && TypeAndToken(b, l + 1);
    r = r && GenericInstantiation_2(b, l + 1);
    r = r && consumeToken(b, CLOSEANGLEBRACKET);
    exit_section_(b, m, GENERIC_INSTANTIATION, r);
    return r;
  }

  // ( comma TypeAndToken)*
  private static boolean GenericInstantiation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInstantiation_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericInstantiation_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericInstantiation_2", c)) break;
    }
    return true;
  }

  // comma TypeAndToken
  private static boolean GenericInstantiation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericInstantiation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // openAngleBracket
  //     (Variance)? NoUSIdent (TypeParameterCharacteristics)*
  //     (comma( Variance)? NoUSIdent (TypeParameterCharacteristics)*)*
  //   closeAngleBracket
  public static boolean GenericParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters")) return false;
    if (!nextTokenIs(b, OPENANGLEBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENANGLEBRACKET);
    r = r && GenericParameters_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && GenericParameters_3(b, l + 1);
    r = r && GenericParameters_4(b, l + 1);
    r = r && consumeToken(b, CLOSEANGLEBRACKET);
    exit_section_(b, m, GENERIC_PARAMETERS, r);
    return r;
  }

  // (Variance)?
  private static boolean GenericParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_1")) return false;
    GenericParameters_1_0(b, l + 1);
    return true;
  }

  // (Variance)
  private static boolean GenericParameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TypeParameterCharacteristics)*
  private static boolean GenericParameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericParameters_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericParameters_3", c)) break;
    }
    return true;
  }

  // (TypeParameterCharacteristics)
  private static boolean GenericParameters_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeParameterCharacteristics(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma( Variance)? NoUSIdent (TypeParameterCharacteristics)*)*
  private static boolean GenericParameters_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericParameters_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericParameters_4", c)) break;
    }
    return true;
  }

  // comma( Variance)? NoUSIdent (TypeParameterCharacteristics)*
  private static boolean GenericParameters_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && GenericParameters_4_0_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && GenericParameters_4_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Variance)?
  private static boolean GenericParameters_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_4_0_1")) return false;
    GenericParameters_4_0_1_0(b, l + 1);
    return true;
  }

  // ( Variance)
  private static boolean GenericParameters_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Variance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TypeParameterCharacteristics)*
  private static boolean GenericParameters_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_4_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericParameters_4_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericParameters_4_0_3", c)) break;
    }
    return true;
  }

  // (TypeParameterCharacteristics)
  private static boolean GenericParameters_4_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParameters_4_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeParameterCharacteristics(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // star | openparen star closeparen | Expression
  public static boolean Guard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Guard")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GUARD, "<guard>");
    r = consumeToken(b, STAR);
    if (!r) r = parseTokens(b, 0, OPENPAREN, STAR, CLOSEPAREN);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // hashtag (GenericInstantiation)? lbracket Expression rbracket openparen (Expressions)? closeparen
  public static boolean HashCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HashCall")) return false;
    if (!nextTokenIs(b, HASHTAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASHTAG);
    r = r && HashCall_1(b, l + 1);
    r = r && consumeToken(b, LBRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACKET, OPENPAREN);
    r = r && HashCall_6(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, HASH_CALL, r);
    return r;
  }

  // (GenericInstantiation)?
  private static boolean HashCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HashCall_1")) return false;
    HashCall_1_0(b, l + 1);
    return true;
  }

  // (GenericInstantiation)
  private static boolean HashCall_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HashCall_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean HashCall_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HashCall_6")) return false;
    HashCall_6_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean HashCall_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HashCall_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lbrace (Expressions)? rbrace
  public static boolean ISetDisplayExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ISetDisplayExpr")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ISetDisplayExpr_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, I_SET_DISPLAY_EXPR, r);
    return r;
  }

  // (Expressions)?
  private static boolean ISetDisplayExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ISetDisplayExpr_1")) return false;
    ISetDisplayExpr_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean ISetDisplayExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ISetDisplayExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identdef
  public static boolean Ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ident")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTDEF);
    exit_section_(b, m, IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // WildIdent colon TypeAndToken
  public static boolean IdentType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentType")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WildIdent(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, IDENT_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // WildIdent (colon TypeAndToken)?
  public static boolean IdentTypeOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeOptional")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WildIdent(b, l + 1);
    r = r && IdentTypeOptional_1(b, l + 1);
    exit_section_(b, m, IDENT_TYPE_OPTIONAL, r);
    return r;
  }

  // (colon TypeAndToken)?
  private static boolean IdentTypeOptional_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeOptional_1")) return false;
    IdentTypeOptional_1_0(b, l + 1);
    return true;
  }

  // colon TypeAndToken
  private static boolean IdentTypeOptional_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentTypeOptional_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if
  //  (
  //      AlternativeBlock
  //      |(
  //          ExistentialGuard
  //          | Guard
  //          | ellipsis
  //      ) BlockStmt (else(IfStmt | BlockStmt))?
  //  )
  public static boolean IfStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && IfStmt_1(b, l + 1);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  // AlternativeBlock
  //      |(
  //          ExistentialGuard
  //          | Guard
  //          | ellipsis
  //      ) BlockStmt (else(IfStmt | BlockStmt))?
  private static boolean IfStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AlternativeBlock(b, l + 1);
    if (!r) r = IfStmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //          ExistentialGuard
  //          | Guard
  //          | ellipsis
  //      ) BlockStmt (else(IfStmt | BlockStmt))?
  private static boolean IfStmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfStmt_1_1_0(b, l + 1);
    r = r && BlockStmt(b, l + 1);
    r = r && IfStmt_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExistentialGuard
  //          | Guard
  //          | ellipsis
  private static boolean IfStmt_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_1_1_0")) return false;
    boolean r;
    r = ExistentialGuard(b, l + 1);
    if (!r) r = Guard(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    return r;
  }

  // (else(IfStmt | BlockStmt))?
  private static boolean IfStmt_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_1_1_2")) return false;
    IfStmt_1_1_2_0(b, l + 1);
    return true;
  }

  // else(IfStmt | BlockStmt)
  private static boolean IfStmt_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && IfStmt_1_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IfStmt | BlockStmt
  private static boolean IfStmt_1_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_1_1_2_0_1")) return false;
    boolean r;
    r = IfStmt(b, l + 1);
    if (!r) r = BlockStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // LogicalExpression
  //  (
  //      (
  //          ImpliesOp ImpliesExpression
  //          | ExpliesOp LogicalExpression (ExpliesOp LogicalExpression)*
  //      )
  //  )?
  public static boolean ImpliesExpliesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpliesExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLIES_EXPLIES_EXPRESSION, "<implies explies expression>");
    r = LogicalExpression(b, l + 1);
    r = r && ImpliesExpliesExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //      (
  //          ImpliesOp ImpliesExpression
  //          | ExpliesOp LogicalExpression (ExpliesOp LogicalExpression)*
  //      )
  //  )?
  private static boolean ImpliesExpliesExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpliesExpression_1")) return false;
    ImpliesExpliesExpression_1_0(b, l + 1);
    return true;
  }

  // ImpliesOp ImpliesExpression
  //          | ExpliesOp LogicalExpression (ExpliesOp LogicalExpression)*
  private static boolean ImpliesExpliesExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpliesExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImpliesExpliesExpression_1_0_0(b, l + 1);
    if (!r) r = ImpliesExpliesExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ImpliesOp ImpliesExpression
  private static boolean ImpliesExpliesExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpliesExpression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImpliesOp(b, l + 1);
    r = r && ImpliesExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ExpliesOp LogicalExpression (ExpliesOp LogicalExpression)*
  private static boolean ImpliesExpliesExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpliesExpression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpliesOp(b, l + 1);
    r = r && LogicalExpression(b, l + 1);
    r = r && ImpliesExpliesExpression_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ExpliesOp LogicalExpression)*
  private static boolean ImpliesExpliesExpression_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpliesExpression_1_0_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ImpliesExpliesExpression_1_0_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImpliesExpliesExpression_1_0_1_2", c)) break;
    }
    return true;
  }

  // ExpliesOp LogicalExpression
  private static boolean ImpliesExpliesExpression_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpliesExpression_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpliesOp(b, l + 1);
    r = r && LogicalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LogicalExpression (ImpliesOp ImpliesExpression)?
  public static boolean ImpliesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLIES_EXPRESSION, "<implies expression>");
    r = LogicalExpression(b, l + 1);
    r = r && ImpliesExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ImpliesOp ImpliesExpression)?
  private static boolean ImpliesExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpression_1")) return false;
    ImpliesExpression_1_0(b, l + 1);
    return true;
  }

  // ImpliesOp ImpliesExpression
  private static boolean ImpliesExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImpliesOp(b, l + 1);
    r = r && ImpliesExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // implyRight | '\u21d2'
  public static boolean ImpliesOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImpliesOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLIES_OP, "<implies op>");
    r = consumeToken(b, IMPLYRIGHT);
    if (!r) r = consumeToken(b, "\\u21d2");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // iterator (Attribute)* NoUSIdent
  //  (
  //      (GenericParameters)? Formals
  //      (( yields |returns) Formals)?
  //      | ellipsis
  //  )
  //  (IteratorSpec)* (BlockStmt)?
  public static boolean IteratorDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl")) return false;
    if (!nextTokenIs(b, ITERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ITERATOR);
    r = r && IteratorDecl_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && IteratorDecl_3(b, l + 1);
    r = r && IteratorDecl_4(b, l + 1);
    r = r && IteratorDecl_5(b, l + 1);
    exit_section_(b, m, ITERATOR_DECL, r);
    return r;
  }

  // (Attribute)*
  private static boolean IteratorDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean IteratorDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? Formals
  //      (( yields |returns) Formals)?
  //      | ellipsis
  private static boolean IteratorDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IteratorDecl_3_0(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? Formals
  //      (( yields |returns) Formals)?
  private static boolean IteratorDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IteratorDecl_3_0_0(b, l + 1);
    r = r && Formals(b, l + 1);
    r = r && IteratorDecl_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean IteratorDecl_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_3_0_0")) return false;
    IteratorDecl_3_0_0_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean IteratorDecl_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (( yields |returns) Formals)?
  private static boolean IteratorDecl_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_3_0_2")) return false;
    IteratorDecl_3_0_2_0(b, l + 1);
    return true;
  }

  // ( yields |returns) Formals
  private static boolean IteratorDecl_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IteratorDecl_3_0_2_0_0(b, l + 1);
    r = r && Formals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // yields |returns
  private static boolean IteratorDecl_3_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_3_0_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, YIELDS);
    if (!r) r = consumeToken(b, RETURNS);
    return r;
  }

  // (IteratorSpec)*
  private static boolean IteratorDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorDecl_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorDecl_4", c)) break;
    }
    return true;
  }

  // (IteratorSpec)
  private static boolean IteratorDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IteratorSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BlockStmt)?
  private static boolean IteratorDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_5")) return false;
    IteratorDecl_5_0(b, l + 1);
    return true;
  }

  // (BlockStmt)
  private static boolean IteratorDecl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorDecl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // reads ( Attribute)* FrameExpression (comma FrameExpression)* OldSemi
  //      | modifies( Attribute)* FrameExpression (comma FrameExpression)* OldSemi
  //      |(free)? (yield)?
  //      (
  //          requires
  //          (LabelIdent colon)? Expression OldSemi
  //          | ensures( Attribute)* Expression OldSemi
  //      )
  //      | decreases( Attribute)*DecreasesList OldSemi
  public static boolean IteratorSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATOR_SPEC, "<iterator spec>");
    r = IteratorSpec_0(b, l + 1);
    if (!r) r = IteratorSpec_1(b, l + 1);
    if (!r) r = IteratorSpec_2(b, l + 1);
    if (!r) r = IteratorSpec_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // reads ( Attribute)* FrameExpression (comma FrameExpression)* OldSemi
  private static boolean IteratorSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READS);
    r = r && IteratorSpec_0_1(b, l + 1);
    r = r && FrameExpression(b, l + 1);
    r = r && IteratorSpec_0_3(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute)*
  private static boolean IteratorSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorSpec_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorSpec_0_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean IteratorSpec_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma FrameExpression)*
  private static boolean IteratorSpec_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorSpec_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorSpec_0_3", c)) break;
    }
    return true;
  }

  // comma FrameExpression
  private static boolean IteratorSpec_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // modifies( Attribute)* FrameExpression (comma FrameExpression)* OldSemi
  private static boolean IteratorSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODIFIES);
    r = r && IteratorSpec_1_1(b, l + 1);
    r = r && FrameExpression(b, l + 1);
    r = r && IteratorSpec_1_3(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute)*
  private static boolean IteratorSpec_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorSpec_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorSpec_1_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean IteratorSpec_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma FrameExpression)*
  private static boolean IteratorSpec_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorSpec_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorSpec_1_3", c)) break;
    }
    return true;
  }

  // comma FrameExpression
  private static boolean IteratorSpec_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (free)? (yield)?
  //      (
  //          requires
  //          (LabelIdent colon)? Expression OldSemi
  //          | ensures( Attribute)* Expression OldSemi
  //      )
  private static boolean IteratorSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IteratorSpec_2_0(b, l + 1);
    r = r && IteratorSpec_2_1(b, l + 1);
    r = r && IteratorSpec_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (free)?
  private static boolean IteratorSpec_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_0")) return false;
    consumeToken(b, FREE);
    return true;
  }

  // (yield)?
  private static boolean IteratorSpec_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_1")) return false;
    consumeToken(b, YIELD);
    return true;
  }

  // requires
  //          (LabelIdent colon)? Expression OldSemi
  //          | ensures( Attribute)* Expression OldSemi
  private static boolean IteratorSpec_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IteratorSpec_2_2_0(b, l + 1);
    if (!r) r = IteratorSpec_2_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // requires
  //          (LabelIdent colon)? Expression OldSemi
  private static boolean IteratorSpec_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUIRES);
    r = r && IteratorSpec_2_2_0_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LabelIdent colon)?
  private static boolean IteratorSpec_2_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_2_0_1")) return false;
    IteratorSpec_2_2_0_1_0(b, l + 1);
    return true;
  }

  // LabelIdent colon
  private static boolean IteratorSpec_2_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelIdent(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ensures( Attribute)* Expression OldSemi
  private static boolean IteratorSpec_2_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENSURES);
    r = r && IteratorSpec_2_2_1_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute)*
  private static boolean IteratorSpec_2_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorSpec_2_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorSpec_2_2_1_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean IteratorSpec_2_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_2_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decreases( Attribute)*DecreasesList OldSemi
  private static boolean IteratorSpec_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECREASES);
    r = r && IteratorSpec_3_1(b, l + 1);
    r = r && DecreasesList(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute)*
  private static boolean IteratorSpec_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!IteratorSpec_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IteratorSpec_3_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean IteratorSpec_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IteratorSpec_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lbracket ( nattoken | ORDINAL) rbracket
  public static boolean KType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KType")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && KType_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, K_TYPE, r);
    return r;
  }

  // nattoken | ORDINAL
  private static boolean KType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KType_1")) return false;
    boolean r;
    r = consumeToken(b, NATTOKEN);
    if (!r) r = consumeToken(b, ORDINAL);
    return r;
  }

  /* ********************************************************** */
  // NoUSIdent | digits
  public static boolean LabelIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelIdent")) return false;
    if (!nextTokenIs(b, "<label ident>", DIGITS, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL_IDENT, "<label ident>");
    r = NoUSIdent(b, l + 1);
    if (!r) r = consumeToken(b, DIGITS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // darrow
  public static boolean LambdaArrow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaArrow")) return false;
    if (!nextTokenIs(b, DARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DARROW);
    exit_section_(b, m, LAMBDA_ARROW, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //      WildIdent
  //      | openparen ( IdentTypeOptional (comma IdentTypeOptional)* )? closeparen
  //  )
  //  (
  //      reads PossiblyWildFrameExpression (comma PossiblyWildFrameExpression)*
  //      | requires Expression
  //  )*
  //  LambdaArrow Expression
  public static boolean LambdaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression")) return false;
    if (!nextTokenIs(b, "<lambda expression>", IDENTDEF, OPENPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA_EXPRESSION, "<lambda expression>");
    r = LambdaExpression_0(b, l + 1);
    r = r && LambdaExpression_1(b, l + 1);
    r = r && LambdaArrow(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WildIdent
  //      | openparen ( IdentTypeOptional (comma IdentTypeOptional)* )? closeparen
  private static boolean LambdaExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WildIdent(b, l + 1);
    if (!r) r = LambdaExpression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen ( IdentTypeOptional (comma IdentTypeOptional)* )? closeparen
  private static boolean LambdaExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && LambdaExpression_0_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IdentTypeOptional (comma IdentTypeOptional)* )?
  private static boolean LambdaExpression_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_0_1_1")) return false;
    LambdaExpression_0_1_1_0(b, l + 1);
    return true;
  }

  // IdentTypeOptional (comma IdentTypeOptional)*
  private static boolean LambdaExpression_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentTypeOptional(b, l + 1);
    r = r && LambdaExpression_0_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma IdentTypeOptional)*
  private static boolean LambdaExpression_0_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_0_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LambdaExpression_0_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LambdaExpression_0_1_1_0_1", c)) break;
    }
    return true;
  }

  // comma IdentTypeOptional
  private static boolean LambdaExpression_0_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_0_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && IdentTypeOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //      reads PossiblyWildFrameExpression (comma PossiblyWildFrameExpression)*
  //      | requires Expression
  //  )*
  private static boolean LambdaExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LambdaExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LambdaExpression_1", c)) break;
    }
    return true;
  }

  // reads PossiblyWildFrameExpression (comma PossiblyWildFrameExpression)*
  //      | requires Expression
  private static boolean LambdaExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LambdaExpression_1_0_0(b, l + 1);
    if (!r) r = LambdaExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // reads PossiblyWildFrameExpression (comma PossiblyWildFrameExpression)*
  private static boolean LambdaExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READS);
    r = r && PossiblyWildFrameExpression(b, l + 1);
    r = r && LambdaExpression_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma PossiblyWildFrameExpression)*
  private static boolean LambdaExpression_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_1_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LambdaExpression_1_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LambdaExpression_1_0_0_2", c)) break;
    }
    return true;
  }

  // comma PossiblyWildFrameExpression
  private static boolean LambdaExpression_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && PossiblyWildFrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // requires Expression
  private static boolean LambdaExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUIRES);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (ghost)? var CasePattern (comma CasePattern)*
  //  (
  //     gets |(Attribute)* boredSmiley
  //  )
  //  Expression (comma Expression )* semi Expression
  public static boolean LetExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr")) return false;
    if (!nextTokenIs(b, "<let expr>", GHOST, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_EXPR, "<let expr>");
    r = LetExpr_0(b, l + 1);
    r = r && consumeToken(b, VAR);
    r = r && CasePattern(b, l + 1);
    r = r && LetExpr_3(b, l + 1);
    r = r && LetExpr_4(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && LetExpr_6(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ghost)?
  private static boolean LetExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_0")) return false;
    consumeToken(b, GHOST);
    return true;
  }

  // (comma CasePattern)*
  private static boolean LetExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LetExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetExpr_3", c)) break;
    }
    return true;
  }

  // comma CasePattern
  private static boolean LetExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && CasePattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // gets |(Attribute)* boredSmiley
  private static boolean LetExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETS);
    if (!r) r = LetExpr_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)* boredSmiley
  private static boolean LetExpr_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LetExpr_4_1_0(b, l + 1);
    r = r && consumeToken(b, BOREDSMILEY);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean LetExpr_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_4_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LetExpr_4_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetExpr_4_1_0", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean LetExpr_4_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_4_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Expression )*
  private static boolean LetExpr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LetExpr_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetExpr_6", c)) break;
    }
    return true;
  }

  // comma Expression
  private static boolean LetExpr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetExpr_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NameSegment (Suffix)*
  //      | ConstAtomExpression Suffix (Suffix)*
  public static boolean Lhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LHS, "<lhs>");
    r = Lhs_0(b, l + 1);
    if (!r) r = Lhs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NameSegment (Suffix)*
  private static boolean Lhs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lhs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameSegment(b, l + 1);
    r = r && Lhs_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean Lhs_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lhs_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Lhs_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Lhs_0_1", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean Lhs_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lhs_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ConstAtomExpression Suffix (Suffix)*
  private static boolean Lhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lhs_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstAtomExpression(b, l + 1);
    r = r && Suffix(b, l + 1);
    r = r && Lhs_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean Lhs_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lhs_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Lhs_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Lhs_1_2", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean Lhs_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lhs_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WildIdent (colon TypeAndToken)?
  public static boolean LocalIdentTypeOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalIdentTypeOptional")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WildIdent(b, l + 1);
    r = r && LocalIdentTypeOptional_1(b, l + 1);
    exit_section_(b, m, LOCAL_IDENT_TYPE_OPTIONAL, r);
    return r;
  }

  // (colon TypeAndToken)?
  private static boolean LocalIdentTypeOptional_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalIdentTypeOptional_1")) return false;
    LocalIdentTypeOptional_1_0(b, l + 1);
    return true;
  }

  // colon TypeAndToken
  private static boolean LocalIdentTypeOptional_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LocalIdentTypeOptional_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AndOp RelationalExpression
  //      (AndOp RelationalExpression)*
  //      | OrOp RelationalExpression (OrOp RelationalExpression)*
  //      | RelationalExpression
  //      (
  //          (
  //              AndOp RelationalExpression (AndOp RelationalExpression)*
  //              | OrOp RelationalExpression (OrOp RelationalExpression)*
  //          )
  //      )?
  public static boolean LogicalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_EXPRESSION, "<logical expression>");
    r = LogicalExpression_0(b, l + 1);
    if (!r) r = LogicalExpression_1(b, l + 1);
    if (!r) r = LogicalExpression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AndOp RelationalExpression
  //      (AndOp RelationalExpression)*
  private static boolean LogicalExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    r = r && LogicalExpression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AndOp RelationalExpression)*
  private static boolean LogicalExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LogicalExpression_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogicalExpression_0_2", c)) break;
    }
    return true;
  }

  // AndOp RelationalExpression
  private static boolean LogicalExpression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OrOp RelationalExpression (OrOp RelationalExpression)*
  private static boolean LogicalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    r = r && LogicalExpression_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OrOp RelationalExpression)*
  private static boolean LogicalExpression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LogicalExpression_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogicalExpression_1_2", c)) break;
    }
    return true;
  }

  // OrOp RelationalExpression
  private static boolean LogicalExpression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RelationalExpression
  //      (
  //          (
  //              AndOp RelationalExpression (AndOp RelationalExpression)*
  //              | OrOp RelationalExpression (OrOp RelationalExpression)*
  //          )
  //      )?
  private static boolean LogicalExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelationalExpression(b, l + 1);
    r = r && LogicalExpression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //          (
  //              AndOp RelationalExpression (AndOp RelationalExpression)*
  //              | OrOp RelationalExpression (OrOp RelationalExpression)*
  //          )
  //      )?
  private static boolean LogicalExpression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1")) return false;
    LogicalExpression_2_1_0(b, l + 1);
    return true;
  }

  // AndOp RelationalExpression (AndOp RelationalExpression)*
  //              | OrOp RelationalExpression (OrOp RelationalExpression)*
  private static boolean LogicalExpression_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LogicalExpression_2_1_0_0(b, l + 1);
    if (!r) r = LogicalExpression_2_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AndOp RelationalExpression (AndOp RelationalExpression)*
  private static boolean LogicalExpression_2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    r = r && LogicalExpression_2_1_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AndOp RelationalExpression)*
  private static boolean LogicalExpression_2_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LogicalExpression_2_1_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogicalExpression_2_1_0_0_2", c)) break;
    }
    return true;
  }

  // AndOp RelationalExpression
  private static boolean LogicalExpression_2_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AndOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OrOp RelationalExpression (OrOp RelationalExpression)*
  private static boolean LogicalExpression_2_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    r = r && LogicalExpression_2_1_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OrOp RelationalExpression)*
  private static boolean LogicalExpression_2_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1_0_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LogicalExpression_2_1_0_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LogicalExpression_2_1_0_1_2", c)) break;
    }
    return true;
  }

  // OrOp RelationalExpression
  private static boolean LogicalExpression_2_1_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogicalExpression_2_1_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OrOp(b, l + 1);
    r = r && RelationalExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (free)? invariant (Attribute)* Expression OldSemi
  //      | decreases (Attribute)* DecreasesList OldSemi
  //      | modifies ( Attribute)* FrameExpression (comma FrameExpression)* OldSemi
  public static boolean LoopSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_SPEC, "<loop spec>");
    r = LoopSpec_0(b, l + 1);
    if (!r) r = LoopSpec_1(b, l + 1);
    if (!r) r = LoopSpec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (free)? invariant (Attribute)* Expression OldSemi
  private static boolean LoopSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LoopSpec_0_0(b, l + 1);
    r = r && consumeToken(b, INVARIANT);
    r = r && LoopSpec_0_2(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (free)?
  private static boolean LoopSpec_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_0_0")) return false;
    consumeToken(b, FREE);
    return true;
  }

  // (Attribute)*
  private static boolean LoopSpec_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LoopSpec_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LoopSpec_0_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean LoopSpec_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decreases (Attribute)* DecreasesList OldSemi
  private static boolean LoopSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECREASES);
    r = r && LoopSpec_1_1(b, l + 1);
    r = r && DecreasesList(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean LoopSpec_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LoopSpec_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LoopSpec_1_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean LoopSpec_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // modifies ( Attribute)* FrameExpression (comma FrameExpression)* OldSemi
  private static boolean LoopSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODIFIES);
    r = r && LoopSpec_2_1(b, l + 1);
    r = r && FrameExpression(b, l + 1);
    r = r && LoopSpec_2_3(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute)*
  private static boolean LoopSpec_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LoopSpec_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LoopSpec_2_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean LoopSpec_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma FrameExpression)*
  private static boolean LoopSpec_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_2_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LoopSpec_2_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LoopSpec_2_3", c)) break;
    }
    return true;
  }

  // comma FrameExpression
  private static boolean LoopSpec_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopSpec_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentTypeOptional (comma IdentTypeOptional )*
  //     (Attribute)* (verticalbar Expression)? QSep
  //     Expression ( gets Expression)?
  public static boolean MapComprehensionExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentTypeOptional(b, l + 1);
    r = r && MapComprehensionExpr_1(b, l + 1);
    r = r && MapComprehensionExpr_2(b, l + 1);
    r = r && MapComprehensionExpr_3(b, l + 1);
    r = r && QSep(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && MapComprehensionExpr_6(b, l + 1);
    exit_section_(b, m, MAP_COMPREHENSION_EXPR, r);
    return r;
  }

  // (comma IdentTypeOptional )*
  private static boolean MapComprehensionExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapComprehensionExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapComprehensionExpr_1", c)) break;
    }
    return true;
  }

  // comma IdentTypeOptional
  private static boolean MapComprehensionExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && IdentTypeOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean MapComprehensionExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapComprehensionExpr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapComprehensionExpr_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean MapComprehensionExpr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (verticalbar Expression)?
  private static boolean MapComprehensionExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_3")) return false;
    MapComprehensionExpr_3_0(b, l + 1);
    return true;
  }

  // verticalbar Expression
  private static boolean MapComprehensionExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VERTICALBAR);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( gets Expression)?
  private static boolean MapComprehensionExpr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_6")) return false;
    MapComprehensionExpr_6_0(b, l + 1);
    return true;
  }

  // gets Expression
  private static boolean MapComprehensionExpr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapComprehensionExpr_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lbracket (MapLiteralExpressions)? rbracket
  public static boolean MapDisplayExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapDisplayExpr")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && MapDisplayExpr_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, MAP_DISPLAY_EXPR, r);
    return r;
  }

  // (MapLiteralExpressions)?
  private static boolean MapDisplayExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapDisplayExpr_1")) return false;
    MapDisplayExpr_1_0(b, l + 1);
    return true;
  }

  // (MapLiteralExpressions)
  private static boolean MapDisplayExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapDisplayExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MapLiteralExpressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression gets Expression (comma Expression gets Expression)*
  public static boolean MapLiteralExpressions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteralExpressions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAP_LITERAL_EXPRESSIONS, "<map literal expressions>");
    r = Expression(b, l + 1);
    r = r && consumeToken(b, GETS);
    r = r && Expression(b, l + 1);
    r = r && MapLiteralExpressions_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (comma Expression gets Expression)*
  private static boolean MapLiteralExpressions_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteralExpressions_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MapLiteralExpressions_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MapLiteralExpressions_3", c)) break;
    }
    return true;
  }

  // comma Expression gets Expression
  private static boolean MapLiteralExpressions_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MapLiteralExpressions_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, GETS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // match Expression
  //  (
  //      lbrace (CaseExpression)* rbrace
  //      | (CaseExpression)*
  //  )
  public static boolean MatchExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression")) return false;
    if (!nextTokenIs(b, MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCH);
    r = r && Expression(b, l + 1);
    r = r && MatchExpression_2(b, l + 1);
    exit_section_(b, m, MATCH_EXPRESSION, r);
    return r;
  }

  // lbrace (CaseExpression)* rbrace
  //      | (CaseExpression)*
  private static boolean MatchExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MatchExpression_2_0(b, l + 1);
    if (!r) r = MatchExpression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lbrace (CaseExpression)* rbrace
  private static boolean MatchExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && MatchExpression_2_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CaseExpression)*
  private static boolean MatchExpression_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MatchExpression_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchExpression_2_0_1", c)) break;
    }
    return true;
  }

  // (CaseExpression)
  private static boolean MatchExpression_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CaseExpression)*
  private static boolean MatchExpression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MatchExpression_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchExpression_2_1", c)) break;
    }
    return true;
  }

  // (CaseExpression)
  private static boolean MatchExpression_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpression_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // match Expression
  //  (
  //      lbrace (CaseStatement )* rbrace
  //      | CaseStatement
  //  )*
  public static boolean MatchStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt")) return false;
    if (!nextTokenIs(b, MATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MATCH);
    r = r && Expression(b, l + 1);
    r = r && MatchStmt_2(b, l + 1);
    exit_section_(b, m, MATCH_STMT, r);
    return r;
  }

  // (
  //      lbrace (CaseStatement )* rbrace
  //      | CaseStatement
  //  )*
  private static boolean MatchStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MatchStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchStmt_2", c)) break;
    }
    return true;
  }

  // lbrace (CaseStatement )* rbrace
  //      | CaseStatement
  private static boolean MatchStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MatchStmt_2_0_0(b, l + 1);
    if (!r) r = CaseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lbrace (CaseStatement )* rbrace
  private static boolean MatchStmt_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && MatchStmt_2_0_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CaseStatement )*
  private static boolean MatchStmt_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt_2_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MatchStmt_2_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchStmt_2_0_0_1", c)) break;
    }
    return true;
  }

  // (CaseStatement )
  private static boolean MatchStmt_2_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchStmt_2_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CaseStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (identdef | digits) gets Expression
  public static boolean MemberBindingUpdate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberBindingUpdate")) return false;
    if (!nextTokenIs(b, "<member binding update>", DIGITS, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_BINDING_UPDATE, "<member binding update>");
    r = MemberBindingUpdate_0(b, l + 1);
    r = r && consumeToken(b, GETS);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identdef | digits
  private static boolean MemberBindingUpdate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberBindingUpdate_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTDEF);
    if (!r) r = consumeToken(b, DIGITS);
    return r;
  }

  /* ********************************************************** */
  // (
  //     method
  //     | lemma
  //     | colemma
  //     | comethod
  //     | inductive lemma
  //     | twostate lemma
  //     | constructor
  //  )
  //  (Attribute)* (FuMe_Ident)?
  //  (
  //     (GenericParameters)? (KType)? Formals (returns Formals)?
  //     | ellipsis
  //  )
  //  (MethodSpec)* (DividedBlockStmt|BlockStmt)?
  public static boolean MethodDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DECL, "<method decl>");
    r = MethodDecl_0(b, l + 1);
    r = r && MethodDecl_1(b, l + 1);
    r = r && MethodDecl_2(b, l + 1);
    r = r && MethodDecl_3(b, l + 1);
    r = r && MethodDecl_4(b, l + 1);
    r = r && MethodDecl_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // method
  //     | lemma
  //     | colemma
  //     | comethod
  //     | inductive lemma
  //     | twostate lemma
  //     | constructor
  private static boolean MethodDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METHOD);
    if (!r) r = consumeToken(b, LEMMA);
    if (!r) r = consumeToken(b, COLEMMA);
    if (!r) r = consumeToken(b, COMETHOD);
    if (!r) r = parseTokens(b, 0, INDUCTIVE, LEMMA);
    if (!r) r = parseTokens(b, 0, TWOSTATE, LEMMA);
    if (!r) r = consumeToken(b, CONSTRUCTOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean MethodDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean MethodDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (FuMe_Ident)?
  private static boolean MethodDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_2")) return false;
    MethodDecl_2_0(b, l + 1);
    return true;
  }

  // (FuMe_Ident)
  private static boolean MethodDecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FuMe_Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? (KType)? Formals (returns Formals)?
  //     | ellipsis
  private static boolean MethodDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodDecl_3_0(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)? (KType)? Formals (returns Formals)?
  private static boolean MethodDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodDecl_3_0_0(b, l + 1);
    r = r && MethodDecl_3_0_1(b, l + 1);
    r = r && Formals(b, l + 1);
    r = r && MethodDecl_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean MethodDecl_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0_0")) return false;
    MethodDecl_3_0_0_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean MethodDecl_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KType)?
  private static boolean MethodDecl_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0_1")) return false;
    MethodDecl_3_0_1_0(b, l + 1);
    return true;
  }

  // (KType)
  private static boolean MethodDecl_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (returns Formals)?
  private static boolean MethodDecl_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0_3")) return false;
    MethodDecl_3_0_3_0(b, l + 1);
    return true;
  }

  // returns Formals
  private static boolean MethodDecl_3_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_3_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURNS);
    r = r && Formals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (MethodSpec)*
  private static boolean MethodDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodDecl_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodDecl_4", c)) break;
    }
    return true;
  }

  // (MethodSpec)
  private static boolean MethodDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DividedBlockStmt|BlockStmt)?
  private static boolean MethodDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_5")) return false;
    MethodDecl_5_0(b, l + 1);
    return true;
  }

  // DividedBlockStmt|BlockStmt
  private static boolean MethodDecl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodDecl_5_0")) return false;
    boolean r;
    r = DividedBlockStmt(b, l + 1);
    if (!r) r = BlockStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // modifies( Attribute)* FrameExpression  (comma FrameExpression)* OldSemi
  //      |(free)?
  //         (
  //             requires (Attribute)* (LabelIdent colon)? Expression OldSemi
  //             | ensures(Attribute)* Expression OldSemi
  //         )
  //      | decreases ( Attribute)*DecreasesList OldSemi
  public static boolean MethodSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_SPEC, "<method spec>");
    r = MethodSpec_0(b, l + 1);
    if (!r) r = MethodSpec_1(b, l + 1);
    if (!r) r = MethodSpec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // modifies( Attribute)* FrameExpression  (comma FrameExpression)* OldSemi
  private static boolean MethodSpec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODIFIES);
    r = r && MethodSpec_0_1(b, l + 1);
    r = r && FrameExpression(b, l + 1);
    r = r && MethodSpec_0_3(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute)*
  private static boolean MethodSpec_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodSpec_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodSpec_0_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean MethodSpec_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma FrameExpression)*
  private static boolean MethodSpec_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodSpec_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodSpec_0_3", c)) break;
    }
    return true;
  }

  // comma FrameExpression
  private static boolean MethodSpec_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (free)?
  //         (
  //             requires (Attribute)* (LabelIdent colon)? Expression OldSemi
  //             | ensures(Attribute)* Expression OldSemi
  //         )
  private static boolean MethodSpec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSpec_1_0(b, l + 1);
    r = r && MethodSpec_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (free)?
  private static boolean MethodSpec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_0")) return false;
    consumeToken(b, FREE);
    return true;
  }

  // requires (Attribute)* (LabelIdent colon)? Expression OldSemi
  //             | ensures(Attribute)* Expression OldSemi
  private static boolean MethodSpec_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodSpec_1_1_0(b, l + 1);
    if (!r) r = MethodSpec_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // requires (Attribute)* (LabelIdent colon)? Expression OldSemi
  private static boolean MethodSpec_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUIRES);
    r = r && MethodSpec_1_1_0_1(b, l + 1);
    r = r && MethodSpec_1_1_0_2(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean MethodSpec_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodSpec_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodSpec_1_1_0_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean MethodSpec_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LabelIdent colon)?
  private static boolean MethodSpec_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_0_2")) return false;
    MethodSpec_1_1_0_2_0(b, l + 1);
    return true;
  }

  // LabelIdent colon
  private static boolean MethodSpec_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelIdent(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ensures(Attribute)* Expression OldSemi
  private static boolean MethodSpec_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENSURES);
    r = r && MethodSpec_1_1_1_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean MethodSpec_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodSpec_1_1_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodSpec_1_1_1_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean MethodSpec_1_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_1_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decreases ( Attribute)*DecreasesList OldSemi
  private static boolean MethodSpec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECREASES);
    r = r && MethodSpec_2_1(b, l + 1);
    r = r && DecreasesList(b, l + 1);
    r = r && OldSemi(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( Attribute)*
  private static boolean MethodSpec_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MethodSpec_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MethodSpec_2_1", c)) break;
    }
    return true;
  }

  // ( Attribute)
  private static boolean MethodSpec_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodSpec_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modify (Attribute)*
  //  (FrameExpression (comma FrameExpression)* | ellipsis)
  //  (BlockStmt | semi)
  public static boolean ModifyStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt")) return false;
    if (!nextTokenIs(b, MODIFY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODIFY);
    r = r && ModifyStmt_1(b, l + 1);
    r = r && ModifyStmt_2(b, l + 1);
    r = r && ModifyStmt_3(b, l + 1);
    exit_section_(b, m, MODIFY_STMT, r);
    return r;
  }

  // (Attribute)*
  private static boolean ModifyStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModifyStmt_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModifyStmt_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean ModifyStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // FrameExpression (comma FrameExpression)* | ellipsis
  private static boolean ModifyStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModifyStmt_2_0(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // FrameExpression (comma FrameExpression)*
  private static boolean ModifyStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FrameExpression(b, l + 1);
    r = r && ModifyStmt_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma FrameExpression)*
  private static boolean ModifyStmt_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModifyStmt_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModifyStmt_2_0_1", c)) break;
    }
    return true;
  }

  // comma FrameExpression
  private static boolean ModifyStmt_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FrameExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BlockStmt | semi
  private static boolean ModifyStmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModifyStmt_3")) return false;
    boolean r;
    r = BlockStmt(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // DotSuffix
  public static boolean ModuleExport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleExport")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_EXPORT, "<module export>");
    r = DotSuffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NoUSIdent (dot NoUSIdent)?
  public static boolean ModuleExportSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleExportSignature")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NoUSIdent(b, l + 1);
    r = r && ModuleExportSignature_1(b, l + 1);
    exit_section_(b, m, MODULE_EXPORT_SIGNATURE, r);
    return r;
  }

  // (dot NoUSIdent)?
  private static boolean ModuleExportSignature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleExportSignature_1")) return false;
    ModuleExportSignature_1_0(b, l + 1);
    return true;
  }

  // dot NoUSIdent
  private static boolean ModuleExportSignature_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleExportSignature_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && NoUSIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident
  public static boolean ModuleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleName")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    exit_section_(b, m, MODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // star| verticalbar | percent
  public static boolean MulOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL_OP, "<mul op>");
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, VERTICALBAR);
    if (!r) r = consumeToken(b, PERCENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // multiset
  //  (
  //      lbrace  (Expressions)? rbrace
  //      | openparen Expression closeparen
  //  )
  public static boolean MultiSetExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiSetExpr")) return false;
    if (!nextTokenIs(b, MULTISET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULTISET);
    r = r && MultiSetExpr_1(b, l + 1);
    exit_section_(b, m, MULTI_SET_EXPR, r);
    return r;
  }

  // lbrace  (Expressions)? rbrace
  //      | openparen Expression closeparen
  private static boolean MultiSetExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiSetExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultiSetExpr_1_0(b, l + 1);
    if (!r) r = MultiSetExpr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lbrace  (Expressions)? rbrace
  private static boolean MultiSetExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiSetExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && MultiSetExpr_1_0_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean MultiSetExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiSetExpr_1_0_1")) return false;
    MultiSetExpr_1_0_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean MultiSetExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiSetExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen Expression closeparen
  private static boolean MultiSetExpr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MultiSetExpr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident (GenericInstantiation|HashCall|)
  public static boolean NameSegment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameSegment")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && NameSegment_1(b, l + 1);
    exit_section_(b, m, NAME_SEGMENT, r);
    return r;
  }

  // GenericInstantiation|HashCall|
  private static boolean NameSegment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameSegment_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericInstantiation(b, l + 1);
    if (!r) r = HashCall(b, l + 1);
    if (!r) r = consumeToken(b, NAMESEGMENT_1_2_0);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident OptGenericInstantiation
  public static boolean NameSegmentForTypeName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameSegmentForTypeName")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, NAME_SEGMENT_FOR_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // label NoUSIdent colon Expression
  public static boolean NamedExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedExpr")) return false;
    if (!nextTokenIs(b, LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LABEL);
    r = r && NoUSIdent(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, NAMED_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // digits | hexdigits
  public static boolean Nat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Nat")) return false;
    if (!nextTokenIs(b, "<nat>", DIGITS, HEXDIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAT, "<nat>");
    r = consumeToken(b, DIGITS);
    if (!r) r = consumeToken(b, HEXDIGITS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // excMark | '\u00ac'
  public static boolean NegOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NegOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEG_OP, "<neg op>");
    r = consumeToken(b, EXCMARK);
    if (!r) r = consumeToken(b, "\\u00ac");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lbracket
  //  (
  //      rbracket lbracket (Expressions)? rbracket
  //      | Expressions rbracket (openparen Expression closeparen | lbracket (Expressions)? rbracket )?
  //  )
  public static boolean NewArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && NewArray_1(b, l + 1);
    exit_section_(b, m, NEW_ARRAY, r);
    return r;
  }

  // rbracket lbracket (Expressions)? rbracket
  //      | Expressions rbracket (openparen Expression closeparen | lbracket (Expressions)? rbracket )?
  private static boolean NewArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewArray_1_0(b, l + 1);
    if (!r) r = NewArray_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // rbracket lbracket (Expressions)? rbracket
  private static boolean NewArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RBRACKET, LBRACKET);
    r = r && NewArray_1_0_2(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean NewArray_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_0_2")) return false;
    NewArray_1_0_2_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean NewArray_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expressions rbracket (openparen Expression closeparen | lbracket (Expressions)? rbracket )?
  private static boolean NewArray_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    r = r && NewArray_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (openparen Expression closeparen | lbracket (Expressions)? rbracket )?
  private static boolean NewArray_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_1_2")) return false;
    NewArray_1_1_2_0(b, l + 1);
    return true;
  }

  // openparen Expression closeparen | lbracket (Expressions)? rbracket
  private static boolean NewArray_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewArray_1_1_2_0_0(b, l + 1);
    if (!r) r = NewArray_1_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen Expression closeparen
  private static boolean NewArray_1_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_1_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // lbracket (Expressions)? rbracket
  private static boolean NewArray_1_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_1_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && NewArray_1_1_2_0_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean NewArray_1_1_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_1_2_0_1_1")) return false;
    NewArray_1_1_2_0_1_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean NewArray_1_1_2_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewArray_1_1_2_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // newtype (Attribute)* NoUSIdent assign
  //  (
  //      NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //      (
  //         (ghost)? witness Expression
  //      )?
  //      | TypeAndToken
  //  )
  public static boolean NewtypeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl")) return false;
    if (!nextTokenIs(b, NEWTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWTYPE);
    r = r && NewtypeDecl_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && NewtypeDecl_4(b, l + 1);
    exit_section_(b, m, NEWTYPE_DECL, r);
    return r;
  }

  // (Attribute)*
  private static boolean NewtypeDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!NewtypeDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NewtypeDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean NewtypeDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //      (
  //         (ghost)? witness Expression
  //      )?
  //      | TypeAndToken
  private static boolean NewtypeDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewtypeDecl_4_0(b, l + 1);
    if (!r) r = TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //      (
  //         (ghost)? witness Expression
  //      )?
  private static boolean NewtypeDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NoUSIdent(b, l + 1);
    r = r && NewtypeDecl_4_0_1(b, l + 1);
    r = r && consumeToken(b, VERTICALBAR);
    r = r && Expression(b, l + 1);
    r = r && NewtypeDecl_4_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon TypeAndToken)?
  private static boolean NewtypeDecl_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_4_0_1")) return false;
    NewtypeDecl_4_0_1_0(b, l + 1);
    return true;
  }

  // colon TypeAndToken
  private static boolean NewtypeDecl_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //         (ghost)? witness Expression
  //      )?
  private static boolean NewtypeDecl_4_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_4_0_4")) return false;
    NewtypeDecl_4_0_4_0(b, l + 1);
    return true;
  }

  // (ghost)? witness Expression
  private static boolean NewtypeDecl_4_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_4_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewtypeDecl_4_0_4_0_0(b, l + 1);
    r = r && consumeToken(b, WITNESS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ghost)?
  private static boolean NewtypeDecl_4_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NewtypeDecl_4_0_4_0_0")) return false;
    consumeToken(b, GHOST);
    return true;
  }

  /* ********************************************************** */
  // identdef
  public static boolean NoUSIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NoUSIdent")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTDEF);
    exit_section_(b, m, NO_US_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // semi
  public static boolean OldSemi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OldSemi")) return false;
    if (!nextTokenIs(b, SEMI)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    exit_section_(b, m, OLD_SEMI, r);
    return r;
  }

  /* ********************************************************** */
  // BlockStmt
  //      | AssertStmt
  //      | AssumeStmt
  //      | PrintStmt
  //      | RevealStmt
  //      | UpdateStmt
  //      | VarDeclStatement
  //      | IfStmt
  //      | WhileStmt
  //      | MatchStmt
  //      | ForallStmt
  //      | CalcStmt
  //      | ModifyStmt
  //      | label LabelIdent colon OneStmt
  //      | break ( LabelIdent |(break)*) semi
  //      | ReturnStmt
  //      | SkeletonStmt
  public static boolean OneStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ONE_STMT, "<one stmt>");
    r = BlockStmt(b, l + 1);
    if (!r) r = AssertStmt(b, l + 1);
    if (!r) r = AssumeStmt(b, l + 1);
    if (!r) r = PrintStmt(b, l + 1);
    if (!r) r = RevealStmt(b, l + 1);
    if (!r) r = UpdateStmt(b, l + 1);
    if (!r) r = VarDeclStatement(b, l + 1);
    if (!r) r = IfStmt(b, l + 1);
    if (!r) r = WhileStmt(b, l + 1);
    if (!r) r = MatchStmt(b, l + 1);
    if (!r) r = ForallStmt(b, l + 1);
    if (!r) r = CalcStmt(b, l + 1);
    if (!r) r = ModifyStmt(b, l + 1);
    if (!r) r = OneStmt_13(b, l + 1);
    if (!r) r = OneStmt_14(b, l + 1);
    if (!r) r = ReturnStmt(b, l + 1);
    if (!r) r = SkeletonStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // label LabelIdent colon OneStmt
  private static boolean OneStmt_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LABEL);
    r = r && LabelIdent(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && OneStmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // break ( LabelIdent |(break)*) semi
  private static boolean OneStmt_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    r = r && OneStmt_14_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // LabelIdent |(break)*
  private static boolean OneStmt_14_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_14_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LabelIdent(b, l + 1);
    if (!r) r = OneStmt_14_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (break)*
  private static boolean OneStmt_14_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OneStmt_14_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, BREAK)) break;
      if (!empty_element_parsed_guard_(b, "OneStmt_14_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (GenericInstantiation)?
  public static boolean OptGenericInstantiation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptGenericInstantiation")) return false;
    Marker m = enter_section_(b, l, _NONE_, OPT_GENERIC_INSTANTIATION, "<opt generic instantiation>");
    OptGenericInstantiation_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // (GenericInstantiation)
  private static boolean OptGenericInstantiation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OptGenericInstantiation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // doubleOr | '\u2228'
  public static boolean OrOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_OP, "<or op>");
    r = consumeToken(b, DOUBLEOR);
    if (!r) r = consumeToken(b, "\\u2228");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type (Attribute)* NoUSIdent
  //  (TypeParameterCharacteristics)* (GenericParameters)?
  //  (assign
  //      (
  //          NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //          (
  //             (ghost)? witness Expression
  //          )?
  //          | TypeAndToken
  //         )
  //     )?
  //  (semi)?
  public static boolean OtherTypeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && OtherTypeDecl_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && OtherTypeDecl_3(b, l + 1);
    r = r && OtherTypeDecl_4(b, l + 1);
    r = r && OtherTypeDecl_5(b, l + 1);
    r = r && OtherTypeDecl_6(b, l + 1);
    exit_section_(b, m, OTHER_TYPE_DECL, r);
    return r;
  }

  // (Attribute)*
  private static boolean OtherTypeDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!OtherTypeDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OtherTypeDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean OtherTypeDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TypeParameterCharacteristics)*
  private static boolean OtherTypeDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!OtherTypeDecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OtherTypeDecl_3", c)) break;
    }
    return true;
  }

  // (TypeParameterCharacteristics)
  private static boolean OtherTypeDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeParameterCharacteristics(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean OtherTypeDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_4")) return false;
    OtherTypeDecl_4_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean OtherTypeDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (assign
  //      (
  //          NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //          (
  //             (ghost)? witness Expression
  //          )?
  //          | TypeAndToken
  //         )
  //     )?
  private static boolean OtherTypeDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5")) return false;
    OtherTypeDecl_5_0(b, l + 1);
    return true;
  }

  // assign
  //      (
  //          NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //          (
  //             (ghost)? witness Expression
  //          )?
  //          | TypeAndToken
  //         )
  private static boolean OtherTypeDecl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && OtherTypeDecl_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //          (
  //             (ghost)? witness Expression
  //          )?
  //          | TypeAndToken
  private static boolean OtherTypeDecl_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OtherTypeDecl_5_0_1_0(b, l + 1);
    if (!r) r = TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NoUSIdent (colon TypeAndToken)? verticalbar Expression
  //          (
  //             (ghost)? witness Expression
  //          )?
  private static boolean OtherTypeDecl_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NoUSIdent(b, l + 1);
    r = r && OtherTypeDecl_5_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, VERTICALBAR);
    r = r && Expression(b, l + 1);
    r = r && OtherTypeDecl_5_0_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon TypeAndToken)?
  private static boolean OtherTypeDecl_5_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0_1_0_1")) return false;
    OtherTypeDecl_5_0_1_0_1_0(b, l + 1);
    return true;
  }

  // colon TypeAndToken
  private static boolean OtherTypeDecl_5_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //             (ghost)? witness Expression
  //          )?
  private static boolean OtherTypeDecl_5_0_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0_1_0_4")) return false;
    OtherTypeDecl_5_0_1_0_4_0(b, l + 1);
    return true;
  }

  // (ghost)? witness Expression
  private static boolean OtherTypeDecl_5_0_1_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0_1_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OtherTypeDecl_5_0_1_0_4_0_0(b, l + 1);
    r = r && consumeToken(b, WITNESS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ghost)?
  private static boolean OtherTypeDecl_5_0_1_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_5_0_1_0_4_0_0")) return false;
    consumeToken(b, GHOST);
    return true;
  }

  // (semi)?
  private static boolean OtherTypeDecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OtherTypeDecl_6")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // openparen (Expressions)? closeparen
  public static boolean ParensExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParensExpression")) return false;
    if (!nextTokenIs(b, OPENPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && ParensExpression_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, PARENS_EXPRESSION, r);
    return r;
  }

  // (Expressions)?
  private static boolean ParensExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParensExpression_1")) return false;
    ParensExpression_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean ParensExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParensExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // star
  //  | Expression
  public static boolean PossiblyWildExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PossiblyWildExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSSIBLY_WILD_EXPRESSION, "<possibly wild expression>");
    r = consumeToken(b, STAR);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // star | FrameExpression
  public static boolean PossiblyWildFrameExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PossiblyWildFrameExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSSIBLY_WILD_FRAME_EXPRESSION, "<possibly wild frame expression>");
    r = consumeToken(b, STAR);
    if (!r) r = FrameExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // print Expression (comma Expression)* semi
  public static boolean PrintStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStmt")) return false;
    if (!nextTokenIs(b, PRINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRINT);
    r = r && Expression(b, l + 1);
    r = r && PrintStmt_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, PRINT_STMT, r);
    return r;
  }

  // (comma Expression)*
  private static boolean PrintStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PrintStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PrintStmt_2", c)) break;
    }
    return true;
  }

  // comma Expression
  private static boolean PrintStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrintStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // doublecolon | 'bullet'
  public static boolean QSep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QSep")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, Q_SEP, "<q sep>");
    r = consumeToken(b, DOUBLECOLON);
    if (!r) r = consumeToken(b, "bullet");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ModuleName (QualifiedModuleExportSuffix)?
  public static boolean QualifiedModuleExport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExport")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleName(b, l + 1);
    r = r && QualifiedModuleExport_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_MODULE_EXPORT, r);
    return r;
  }

  // (QualifiedModuleExportSuffix)?
  private static boolean QualifiedModuleExport_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExport_1")) return false;
    QualifiedModuleExport_1_0(b, l + 1);
    return true;
  }

  // (QualifiedModuleExportSuffix)
  private static boolean QualifiedModuleExport_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExport_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedModuleExportSuffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dot ModuleName (dot ModuleName )*
  //     | " " (
  //         ModuleExport
  //         | lbrace ModuleExport (comma ModuleExport )* rbrace
  //     )
  public static boolean QualifiedModuleExportSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_MODULE_EXPORT_SUFFIX, "<qualified module export suffix>");
    r = QualifiedModuleExportSuffix_0(b, l + 1);
    if (!r) r = QualifiedModuleExportSuffix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // dot ModuleName (dot ModuleName )*
  private static boolean QualifiedModuleExportSuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && ModuleName(b, l + 1);
    r = r && QualifiedModuleExportSuffix_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (dot ModuleName )*
  private static boolean QualifiedModuleExportSuffix_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QualifiedModuleExportSuffix_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedModuleExportSuffix_0_2", c)) break;
    }
    return true;
  }

  // dot ModuleName
  private static boolean QualifiedModuleExportSuffix_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && ModuleName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // " " (
  //         ModuleExport
  //         | lbrace ModuleExport (comma ModuleExport )* rbrace
  //     )
  private static boolean QualifiedModuleExportSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, " ");
    r = r && QualifiedModuleExportSuffix_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ModuleExport
  //         | lbrace ModuleExport (comma ModuleExport )* rbrace
  private static boolean QualifiedModuleExportSuffix_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleExport(b, l + 1);
    if (!r) r = QualifiedModuleExportSuffix_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lbrace ModuleExport (comma ModuleExport )* rbrace
  private static boolean QualifiedModuleExportSuffix_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ModuleExport(b, l + 1);
    r = r && QualifiedModuleExportSuffix_1_1_1_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ModuleExport )*
  private static boolean QualifiedModuleExportSuffix_1_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_1_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QualifiedModuleExportSuffix_1_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QualifiedModuleExportSuffix_1_1_1_2", c)) break;
    }
    return true;
  }

  // comma ModuleExport
  private static boolean QualifiedModuleExportSuffix_1_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QualifiedModuleExportSuffix_1_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ModuleExport(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentTypeOptional (comma IdentTypeOptional)* (Attribute)* (verticalbarExpression)?
  public static boolean QuantifierDomain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierDomain")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentTypeOptional(b, l + 1);
    r = r && QuantifierDomain_1(b, l + 1);
    r = r && QuantifierDomain_2(b, l + 1);
    r = r && QuantifierDomain_3(b, l + 1);
    exit_section_(b, m, QUANTIFIER_DOMAIN, r);
    return r;
  }

  // (comma IdentTypeOptional)*
  private static boolean QuantifierDomain_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierDomain_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QuantifierDomain_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QuantifierDomain_1", c)) break;
    }
    return true;
  }

  // comma IdentTypeOptional
  private static boolean QuantifierDomain_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierDomain_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && IdentTypeOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean QuantifierDomain_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierDomain_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QuantifierDomain_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "QuantifierDomain_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean QuantifierDomain_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierDomain_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (verticalbarExpression)?
  private static boolean QuantifierDomain_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierDomain_3")) return false;
    consumeToken(b, VERTICALBAREXPRESSION);
    return true;
  }

  /* ********************************************************** */
  // (Forall | Exists) QuantifierDomain QSep Expression
  public static boolean QuantifierGuts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANTIFIER_GUTS, "<quantifier guts>");
    r = QuantifierGuts_0(b, l + 1);
    r = r && QuantifierDomain(b, l + 1);
    r = r && QSep(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Forall | Exists
  private static boolean QuantifierGuts_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QuantifierGuts_0")) return false;
    boolean r;
    r = Forall(b, l + 1);
    if (!r) r = Exists(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // eq (hashtag lbracket Expression rbracket)?
  //      | openAngleBracket
  //      | closeAngleBracket
  //      | darrow
  //      | biggerEq
  //      | neq (hashtag lbracket Expression rbracket)?
  //      | in
  //      | notIn
  //      | excMark (excMark)?
  //      | 'neqAlt'
  //      | '\u2264'
  //      | '\u2265'
  public static boolean RelOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REL_OP, "<rel op>");
    r = RelOp_0(b, l + 1);
    if (!r) r = consumeToken(b, OPENANGLEBRACKET);
    if (!r) r = consumeToken(b, CLOSEANGLEBRACKET);
    if (!r) r = consumeToken(b, DARROW);
    if (!r) r = consumeToken(b, BIGGEREQ);
    if (!r) r = RelOp_5(b, l + 1);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, NOTIN);
    if (!r) r = RelOp_8(b, l + 1);
    if (!r) r = consumeToken(b, "neqAlt");
    if (!r) r = consumeToken(b, "\\u2264");
    if (!r) r = consumeToken(b, "\\u2265");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // eq (hashtag lbracket Expression rbracket)?
  private static boolean RelOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && RelOp_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (hashtag lbracket Expression rbracket)?
  private static boolean RelOp_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_0_1")) return false;
    RelOp_0_1_0(b, l + 1);
    return true;
  }

  // hashtag lbracket Expression rbracket
  private static boolean RelOp_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASHTAG, LBRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // neq (hashtag lbracket Expression rbracket)?
  private static boolean RelOp_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEQ);
    r = r && RelOp_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (hashtag lbracket Expression rbracket)?
  private static boolean RelOp_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_5_1")) return false;
    RelOp_5_1_0(b, l + 1);
    return true;
  }

  // hashtag lbracket Expression rbracket
  private static boolean RelOp_5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASHTAG, LBRACKET);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // excMark (excMark)?
  private static boolean RelOp_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXCMARK);
    r = r && RelOp_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (excMark)?
  private static boolean RelOp_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelOp_8_1")) return false;
    consumeToken(b, EXCMARK);
    return true;
  }

  /* ********************************************************** */
  // ShiftTerm
  //  (
  //      RelOp ShiftTerm (RelOp ShiftTerm)*
  //  )?
  public static boolean RelationalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_EXPRESSION, "<relational expression>");
    r = ShiftTerm(b, l + 1);
    r = r && RelationalExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //      RelOp ShiftTerm (RelOp ShiftTerm)*
  //  )?
  private static boolean RelationalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression_1")) return false;
    RelationalExpression_1_0(b, l + 1);
    return true;
  }

  // RelOp ShiftTerm (RelOp ShiftTerm)*
  private static boolean RelationalExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelOp(b, l + 1);
    r = r && ShiftTerm(b, l + 1);
    r = r && RelationalExpression_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (RelOp ShiftTerm)*
  private static boolean RelationalExpression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RelationalExpression_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RelationalExpression_1_0_2", c)) break;
    }
    return true;
  }

  // RelOp ShiftTerm
  private static boolean RelationalExpression_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelationalExpression_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelOp(b, l + 1);
    r = r && ShiftTerm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (return | yield) (Rhs (comma Rhs)* )? semi
  public static boolean ReturnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt")) return false;
    if (!nextTokenIs(b, "<return stmt>", RETURN, YIELD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STMT, "<return stmt>");
    r = ReturnStmt_0(b, l + 1);
    r = r && ReturnStmt_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // return | yield
  private static boolean ReturnStmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt_0")) return false;
    boolean r;
    r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, YIELD);
    return r;
  }

  // (Rhs (comma Rhs)* )?
  private static boolean ReturnStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt_1")) return false;
    ReturnStmt_1_0(b, l + 1);
    return true;
  }

  // Rhs (comma Rhs)*
  private static boolean ReturnStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Rhs(b, l + 1);
    r = r && ReturnStmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Rhs)*
  private static boolean ReturnStmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ReturnStmt_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ReturnStmt_1_0_1", c)) break;
    }
    return true;
  }

  // comma Rhs
  private static boolean ReturnStmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // reveal Expression (comma Expression)* semi
  public static boolean RevealStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RevealStmt")) return false;
    if (!nextTokenIs(b, REVEAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REVEAL);
    r = r && Expression(b, l + 1);
    r = r && RevealStmt_2(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, REVEAL_STMT, r);
    return r;
  }

  // (comma Expression)*
  private static boolean RevealStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RevealStmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RevealStmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RevealStmt_2", c)) break;
    }
    return true;
  }

  // comma Expression
  private static boolean RevealStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RevealStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //      new
  //      (
  //          NewArray
  //          | TypeAndToken (NewArray | openparen (Expressions)? closeparen )?
  //      )
  //      | star
  //      | Expression
  //  )
  //  (Attribute)*
  public static boolean Rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS, "<rhs>");
    r = Rhs_0(b, l + 1);
    r = r && Rhs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // new
  //      (
  //          NewArray
  //          | TypeAndToken (NewArray | openparen (Expressions)? closeparen )?
  //      )
  //      | star
  //      | Expression
  private static boolean Rhs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Rhs_0_0(b, l + 1);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // new
  //      (
  //          NewArray
  //          | TypeAndToken (NewArray | openparen (Expressions)? closeparen )?
  //      )
  private static boolean Rhs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && Rhs_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NewArray
  //          | TypeAndToken (NewArray | openparen (Expressions)? closeparen )?
  private static boolean Rhs_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewArray(b, l + 1);
    if (!r) r = Rhs_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeAndToken (NewArray | openparen (Expressions)? closeparen )?
  private static boolean Rhs_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeAndToken(b, l + 1);
    r = r && Rhs_0_0_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NewArray | openparen (Expressions)? closeparen )?
  private static boolean Rhs_0_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0_1_1_1")) return false;
    Rhs_0_0_1_1_1_0(b, l + 1);
    return true;
  }

  // NewArray | openparen (Expressions)? closeparen
  private static boolean Rhs_0_0_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NewArray(b, l + 1);
    if (!r) r = Rhs_0_0_1_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen (Expressions)? closeparen
  private static boolean Rhs_0_0_1_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0_1_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && Rhs_0_0_1_1_1_0_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean Rhs_0_0_1_1_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0_1_1_1_0_1_1")) return false;
    Rhs_0_0_1_1_1_0_1_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean Rhs_0_0_1_1_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_0_0_1_1_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean Rhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Rhs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Rhs_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean Rhs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Rhs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentTypeOptional (comma IdentTypeOptional)*
  //  (Attribute)* verticalbar Expression (QSep Expression)?
  public static boolean SetComprehensionExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetComprehensionExpr")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentTypeOptional(b, l + 1);
    r = r && SetComprehensionExpr_1(b, l + 1);
    r = r && SetComprehensionExpr_2(b, l + 1);
    r = r && consumeToken(b, VERTICALBAR);
    r = r && Expression(b, l + 1);
    r = r && SetComprehensionExpr_5(b, l + 1);
    exit_section_(b, m, SET_COMPREHENSION_EXPR, r);
    return r;
  }

  // (comma IdentTypeOptional)*
  private static boolean SetComprehensionExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetComprehensionExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SetComprehensionExpr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SetComprehensionExpr_1", c)) break;
    }
    return true;
  }

  // comma IdentTypeOptional
  private static boolean SetComprehensionExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetComprehensionExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && IdentTypeOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean SetComprehensionExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetComprehensionExpr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SetComprehensionExpr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SetComprehensionExpr_2", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean SetComprehensionExpr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetComprehensionExpr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (QSep Expression)?
  private static boolean SetComprehensionExpr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetComprehensionExpr_5")) return false;
    SetComprehensionExpr_5_0(b, l + 1);
    return true;
  }

  // QSep Expression
  private static boolean SetComprehensionExpr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SetComprehensionExpr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QSep(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Term
  //    (
  //      (
  //         openAngleBracket openAngleBracket
  //         | closeAngleBracket closeAngleBracket
  //      )
  //      Term
  //    )*
  public static boolean ShiftTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_TERM, "<shift term>");
    r = Term(b, l + 1);
    r = r && ShiftTerm_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //      (
  //         openAngleBracket openAngleBracket
  //         | closeAngleBracket closeAngleBracket
  //      )
  //      Term
  //    )*
  private static boolean ShiftTerm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftTerm_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ShiftTerm_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ShiftTerm_1", c)) break;
    }
    return true;
  }

  // (
  //         openAngleBracket openAngleBracket
  //         | closeAngleBracket closeAngleBracket
  //      )
  //      Term
  private static boolean ShiftTerm_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftTerm_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShiftTerm_1_0_0(b, l + 1);
    r = r && Term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openAngleBracket openAngleBracket
  //         | closeAngleBracket closeAngleBracket
  private static boolean ShiftTerm_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShiftTerm_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, OPENANGLEBRACKET, OPENANGLEBRACKET);
    if (!r) r = parseTokens(b, 0, CLOSEANGLEBRACKET, CLOSEANGLEBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ellipsis (where Ident (comma Ident)* gets Expression (comma Expression)*)? semi
  public static boolean SkeletonStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SkeletonStmt")) return false;
    if (!nextTokenIs(b, ELLIPSIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSIS);
    r = r && SkeletonStmt_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, SKELETON_STMT, r);
    return r;
  }

  // (where Ident (comma Ident)* gets Expression (comma Expression)*)?
  private static boolean SkeletonStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SkeletonStmt_1")) return false;
    SkeletonStmt_1_0(b, l + 1);
    return true;
  }

  // where Ident (comma Ident)* gets Expression (comma Expression)*
  private static boolean SkeletonStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SkeletonStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && Ident(b, l + 1);
    r = r && SkeletonStmt_1_0_2(b, l + 1);
    r = r && consumeToken(b, GETS);
    r = r && Expression(b, l + 1);
    r = r && SkeletonStmt_1_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Ident)*
  private static boolean SkeletonStmt_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SkeletonStmt_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SkeletonStmt_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SkeletonStmt_1_0_2", c)) break;
    }
    return true;
  }

  // comma Ident
  private static boolean SkeletonStmt_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SkeletonStmt_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Ident(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Expression)*
  private static boolean SkeletonStmt_1_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SkeletonStmt_1_0_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SkeletonStmt_1_0_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SkeletonStmt_1_0_5", c)) break;
    }
    return true;
  }

  // comma Expression
  private static boolean SkeletonStmt_1_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SkeletonStmt_1_0_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OneStmt
  public static boolean Stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = OneStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AssertStmt | AssumeStmt | CalcStmt
  public static boolean StmtInExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StmtInExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT_IN_EXPR, "<stmt in expr>");
    r = AssertStmt(b, l + 1);
    if (!r) r = AssumeStmt(b, l + 1);
    if (!r) r = CalcStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // module (Attribute)* NoUSIdent (dot NoUSIdent)* (refines ModuleName)? lbrace (TopDecl)* rbrace
  //     | import (opened)? ModuleName
  //     (
  //         assign QualifiedModuleExport
  //         | colon QualifiedModuleExport
  //         | (QualifiedModuleExportSuffix)?
  //     )
  //     (semi)?
  //     | export (ModuleExport)?
  //     (
  //         provides
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature)* )
  //             | star
  //         )
  //         | reveals
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature )* )
  //             | star
  //         )
  //         | extends ModuleExport (comma ModuleExport )* )*
  public static boolean SubModuleDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUB_MODULE_DECL, "<sub module decl>");
    r = SubModuleDecl_0(b, l + 1);
    if (!r) r = SubModuleDecl_1(b, l + 1);
    if (!r) r = SubModuleDecl_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // module (Attribute)* NoUSIdent (dot NoUSIdent)* (refines ModuleName)? lbrace (TopDecl)* rbrace
  private static boolean SubModuleDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODULE);
    r = r && SubModuleDecl_0_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && SubModuleDecl_0_3(b, l + 1);
    r = r && SubModuleDecl_0_4(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && SubModuleDecl_0_6(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean SubModuleDecl_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SubModuleDecl_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubModuleDecl_0_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean SubModuleDecl_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (dot NoUSIdent)*
  private static boolean SubModuleDecl_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SubModuleDecl_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubModuleDecl_0_3", c)) break;
    }
    return true;
  }

  // dot NoUSIdent
  private static boolean SubModuleDecl_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && NoUSIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (refines ModuleName)?
  private static boolean SubModuleDecl_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_4")) return false;
    SubModuleDecl_0_4_0(b, l + 1);
    return true;
  }

  // refines ModuleName
  private static boolean SubModuleDecl_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REFINES);
    r = r && ModuleName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TopDecl)*
  private static boolean SubModuleDecl_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SubModuleDecl_0_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubModuleDecl_0_6", c)) break;
    }
    return true;
  }

  // (TopDecl)
  private static boolean SubModuleDecl_0_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_0_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TopDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // import (opened)? ModuleName
  //     (
  //         assign QualifiedModuleExport
  //         | colon QualifiedModuleExport
  //         | (QualifiedModuleExportSuffix)?
  //     )
  //     (semi)?
  private static boolean SubModuleDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && SubModuleDecl_1_1(b, l + 1);
    r = r && ModuleName(b, l + 1);
    r = r && SubModuleDecl_1_3(b, l + 1);
    r = r && SubModuleDecl_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (opened)?
  private static boolean SubModuleDecl_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1_1")) return false;
    consumeToken(b, OPENED);
    return true;
  }

  // assign QualifiedModuleExport
  //         | colon QualifiedModuleExport
  //         | (QualifiedModuleExportSuffix)?
  private static boolean SubModuleDecl_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubModuleDecl_1_3_0(b, l + 1);
    if (!r) r = SubModuleDecl_1_3_1(b, l + 1);
    if (!r) r = SubModuleDecl_1_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assign QualifiedModuleExport
  private static boolean SubModuleDecl_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && QualifiedModuleExport(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // colon QualifiedModuleExport
  private static boolean SubModuleDecl_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && QualifiedModuleExport(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (QualifiedModuleExportSuffix)?
  private static boolean SubModuleDecl_1_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1_3_2")) return false;
    SubModuleDecl_1_3_2_0(b, l + 1);
    return true;
  }

  // (QualifiedModuleExportSuffix)
  private static boolean SubModuleDecl_1_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = QualifiedModuleExportSuffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (semi)?
  private static boolean SubModuleDecl_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_1_4")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  // export (ModuleExport)?
  //     (
  //         provides
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature)* )
  //             | star
  //         )
  //         | reveals
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature )* )
  //             | star
  //         )
  //         | extends ModuleExport (comma ModuleExport )* )*
  private static boolean SubModuleDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPORT);
    r = r && SubModuleDecl_2_1(b, l + 1);
    r = r && SubModuleDecl_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ModuleExport)?
  private static boolean SubModuleDecl_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_1")) return false;
    SubModuleDecl_2_1_0(b, l + 1);
    return true;
  }

  // (ModuleExport)
  private static boolean SubModuleDecl_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleExport(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //         provides
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature)* )
  //             | star
  //         )
  //         | reveals
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature )* )
  //             | star
  //         )
  //         | extends ModuleExport (comma ModuleExport )* )*
  private static boolean SubModuleDecl_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SubModuleDecl_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubModuleDecl_2_2", c)) break;
    }
    return true;
  }

  // provides
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature)* )
  //             | star
  //         )
  //         | reveals
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature )* )
  //             | star
  //         )
  //         | extends ModuleExport (comma ModuleExport )*
  private static boolean SubModuleDecl_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubModuleDecl_2_2_0_0(b, l + 1);
    if (!r) r = SubModuleDecl_2_2_0_1(b, l + 1);
    if (!r) r = SubModuleDecl_2_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // provides
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature)* )
  //             | star
  //         )
  private static boolean SubModuleDecl_2_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROVIDES);
    r = r && SubModuleDecl_2_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ModuleExportSignature (comma ModuleExportSignature)* )
  //             | star
  private static boolean SubModuleDecl_2_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubModuleDecl_2_2_0_0_1_0(b, l + 1);
    if (!r) r = consumeToken(b, STAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ModuleExportSignature (comma ModuleExportSignature)*
  private static boolean SubModuleDecl_2_2_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleExportSignature(b, l + 1);
    r = r && SubModuleDecl_2_2_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ModuleExportSignature)*
  private static boolean SubModuleDecl_2_2_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SubModuleDecl_2_2_0_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubModuleDecl_2_2_0_0_1_0_1", c)) break;
    }
    return true;
  }

  // comma ModuleExportSignature
  private static boolean SubModuleDecl_2_2_0_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ModuleExportSignature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // reveals
  //         (
  //             ( ModuleExportSignature (comma ModuleExportSignature )* )
  //             | star
  //         )
  private static boolean SubModuleDecl_2_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REVEALS);
    r = r && SubModuleDecl_2_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ModuleExportSignature (comma ModuleExportSignature )* )
  //             | star
  private static boolean SubModuleDecl_2_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SubModuleDecl_2_2_0_1_1_0(b, l + 1);
    if (!r) r = consumeToken(b, STAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ModuleExportSignature (comma ModuleExportSignature )*
  private static boolean SubModuleDecl_2_2_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ModuleExportSignature(b, l + 1);
    r = r && SubModuleDecl_2_2_0_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ModuleExportSignature )*
  private static boolean SubModuleDecl_2_2_0_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SubModuleDecl_2_2_0_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubModuleDecl_2_2_0_1_1_0_1", c)) break;
    }
    return true;
  }

  // comma ModuleExportSignature
  private static boolean SubModuleDecl_2_2_0_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ModuleExportSignature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // extends ModuleExport (comma ModuleExport )*
  private static boolean SubModuleDecl_2_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && ModuleExport(b, l + 1);
    r = r && SubModuleDecl_2_2_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma ModuleExport )*
  private static boolean SubModuleDecl_2_2_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SubModuleDecl_2_2_0_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SubModuleDecl_2_2_0_2_2", c)) break;
    }
    return true;
  }

  // comma ModuleExport
  private static boolean SubModuleDecl_2_2_0_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SubModuleDecl_2_2_0_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ModuleExport(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dot
  //      (
  //          openparen MemberBindingUpdate (comma MemberBindingUpdate)* closeparen
  //          | DotSuffix (GenericInstantiation|HashCall|)
  //      )
  //      | lbracket
  //      (
  //          Expression
  //          (
  //              doubleDot(Expression)?
  //              | gets Expression
  //              | colon (Expression ( colon Expression)* (colon)? )?
  //              | (comma Expression)*
  //          )
  //          | doubleDot
  //          (Expression)?
  //      )
  //      rbracket
  //      | openparen
  //      (Expressions)? closeparen
  public static boolean Suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = Suffix_0(b, l + 1);
    if (!r) r = Suffix_1(b, l + 1);
    if (!r) r = Suffix_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // dot
  //      (
  //          openparen MemberBindingUpdate (comma MemberBindingUpdate)* closeparen
  //          | DotSuffix (GenericInstantiation|HashCall|)
  //      )
  private static boolean Suffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && Suffix_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen MemberBindingUpdate (comma MemberBindingUpdate)* closeparen
  //          | DotSuffix (GenericInstantiation|HashCall|)
  private static boolean Suffix_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix_0_1_0(b, l + 1);
    if (!r) r = Suffix_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen MemberBindingUpdate (comma MemberBindingUpdate)* closeparen
  private static boolean Suffix_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && MemberBindingUpdate(b, l + 1);
    r = r && Suffix_0_1_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma MemberBindingUpdate)*
  private static boolean Suffix_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Suffix_0_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Suffix_0_1_0_2", c)) break;
    }
    return true;
  }

  // comma MemberBindingUpdate
  private static boolean Suffix_0_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_0_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && MemberBindingUpdate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DotSuffix (GenericInstantiation|HashCall|)
  private static boolean Suffix_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DotSuffix(b, l + 1);
    r = r && Suffix_0_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // GenericInstantiation|HashCall|
  private static boolean Suffix_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_0_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericInstantiation(b, l + 1);
    if (!r) r = HashCall(b, l + 1);
    if (!r) r = consumeToken(b, SUFFIX_0_1_1_1_2_0);
    exit_section_(b, m, null, r);
    return r;
  }

  // lbracket
  //      (
  //          Expression
  //          (
  //              doubleDot(Expression)?
  //              | gets Expression
  //              | colon (Expression ( colon Expression)* (colon)? )?
  //              | (comma Expression)*
  //          )
  //          | doubleDot
  //          (Expression)?
  //      )
  //      rbracket
  private static boolean Suffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && Suffix_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression
  //          (
  //              doubleDot(Expression)?
  //              | gets Expression
  //              | colon (Expression ( colon Expression)* (colon)? )?
  //              | (comma Expression)*
  //          )
  //          | doubleDot
  //          (Expression)?
  private static boolean Suffix_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix_1_1_0(b, l + 1);
    if (!r) r = Suffix_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression
  //          (
  //              doubleDot(Expression)?
  //              | gets Expression
  //              | colon (Expression ( colon Expression)* (colon)? )?
  //              | (comma Expression)*
  //          )
  private static boolean Suffix_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && Suffix_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // doubleDot(Expression)?
  //              | gets Expression
  //              | colon (Expression ( colon Expression)* (colon)? )?
  //              | (comma Expression)*
  private static boolean Suffix_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix_1_1_0_1_0(b, l + 1);
    if (!r) r = Suffix_1_1_0_1_1(b, l + 1);
    if (!r) r = Suffix_1_1_0_1_2(b, l + 1);
    if (!r) r = Suffix_1_1_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // doubleDot(Expression)?
  private static boolean Suffix_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLEDOT);
    r = r && Suffix_1_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression)?
  private static boolean Suffix_1_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_0_1")) return false;
    Suffix_1_1_0_1_0_1_0(b, l + 1);
    return true;
  }

  // (Expression)
  private static boolean Suffix_1_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // gets Expression
  private static boolean Suffix_1_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETS);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // colon (Expression ( colon Expression)* (colon)? )?
  private static boolean Suffix_1_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Suffix_1_1_0_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression ( colon Expression)* (colon)? )?
  private static boolean Suffix_1_1_0_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_2_1")) return false;
    Suffix_1_1_0_1_2_1_0(b, l + 1);
    return true;
  }

  // Expression ( colon Expression)* (colon)?
  private static boolean Suffix_1_1_0_1_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && Suffix_1_1_0_1_2_1_0_1(b, l + 1);
    r = r && Suffix_1_1_0_1_2_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( colon Expression)*
  private static boolean Suffix_1_1_0_1_2_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_2_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Suffix_1_1_0_1_2_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Suffix_1_1_0_1_2_1_0_1", c)) break;
    }
    return true;
  }

  // colon Expression
  private static boolean Suffix_1_1_0_1_2_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_2_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon)?
  private static boolean Suffix_1_1_0_1_2_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_2_1_0_2")) return false;
    consumeToken(b, COLON);
    return true;
  }

  // (comma Expression)*
  private static boolean Suffix_1_1_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Suffix_1_1_0_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Suffix_1_1_0_1_3", c)) break;
    }
    return true;
  }

  // comma Expression
  private static boolean Suffix_1_1_0_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_0_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // doubleDot
  //          (Expression)?
  private static boolean Suffix_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLEDOT);
    r = r && Suffix_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression)?
  private static boolean Suffix_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_1_1")) return false;
    Suffix_1_1_1_1_0(b, l + 1);
    return true;
  }

  // (Expression)
  private static boolean Suffix_1_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_1_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen
  //      (Expressions)? closeparen
  private static boolean Suffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && Suffix_2_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expressions)?
  private static boolean Suffix_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_2_1")) return false;
    Suffix_2_1_0(b, l + 1);
    return true;
  }

  // (Expressions)
  private static boolean Suffix_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Suffix_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expressions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // eq | digits | excMark new
  public static boolean TPCharOption(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TPCharOption")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TP_CHAR_OPTION, "<tp char option>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, DIGITS);
    if (!r) r = parseTokens(b, 0, EXCMARK, NEW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Factor (AddOp Factor)*
  public static boolean Term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = Factor(b, l + 1);
    r = r && Term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (AddOp Factor)*
  private static boolean Term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Term_1", c)) break;
    }
    return true;
  }

  // AddOp Factor
  private static boolean Term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddOp(b, l + 1);
    r = r && Factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (DeclModifier)*
  //  (
  //      SubModuleDecl
  //      | ClassDecl
  //      | DatatypeDecl
  //      | NewtypeDecl
  //      | OtherTypeDecl
  //      | IteratorDecl
  //      | TraitDecl
  //      | ClassMemberDecl
  //  )
  public static boolean TopDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_DECL, "<top decl>");
    r = TopDecl_0(b, l + 1);
    r = r && TopDecl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DeclModifier)*
  private static boolean TopDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopDecl_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TopDecl_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TopDecl_0", c)) break;
    }
    return true;
  }

  // (DeclModifier)
  private static boolean TopDecl_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopDecl_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclModifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SubModuleDecl
  //      | ClassDecl
  //      | DatatypeDecl
  //      | NewtypeDecl
  //      | OtherTypeDecl
  //      | IteratorDecl
  //      | TraitDecl
  //      | ClassMemberDecl
  private static boolean TopDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopDecl_1")) return false;
    boolean r;
    r = SubModuleDecl(b, l + 1);
    if (!r) r = ClassDecl(b, l + 1);
    if (!r) r = DatatypeDecl(b, l + 1);
    if (!r) r = NewtypeDecl(b, l + 1);
    if (!r) r = OtherTypeDecl(b, l + 1);
    if (!r) r = IteratorDecl(b, l + 1);
    if (!r) r = TraitDecl(b, l + 1);
    if (!r) r = ClassMemberDecl(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // trait (Attribute)* NoUSIdent (GenericParameters)? lbrace
  //  (
  //     (DeclModifier)* ClassMemberDecl
  //  )*
  //  rbrace
  public static boolean TraitDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl")) return false;
    if (!nextTokenIs(b, TRAIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRAIT);
    r = r && TraitDecl_1(b, l + 1);
    r = r && NoUSIdent(b, l + 1);
    r = r && TraitDecl_3(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && TraitDecl_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, TRAIT_DECL, r);
    return r;
  }

  // (Attribute)*
  private static boolean TraitDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TraitDecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitDecl_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean TraitDecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GenericParameters)?
  private static boolean TraitDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_3")) return false;
    TraitDecl_3_0(b, l + 1);
    return true;
  }

  // (GenericParameters)
  private static boolean TraitDecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GenericParameters(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //     (DeclModifier)* ClassMemberDecl
  //  )*
  private static boolean TraitDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TraitDecl_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitDecl_5", c)) break;
    }
    return true;
  }

  // (DeclModifier)* ClassMemberDecl
  private static boolean TraitDecl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TraitDecl_5_0_0(b, l + 1);
    r = r && ClassMemberDecl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DeclModifier)*
  private static boolean TraitDecl_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_5_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TraitDecl_5_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitDecl_5_0_0", c)) break;
    }
    return true;
  }

  // (DeclModifier)
  private static boolean TraitDecl_5_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitDecl_5_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DeclModifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (
  //      bool
  //      | char
  //      | int
  //      | nattoken
  //      | real
  //      | ORDINAL
  //      | bvToken
  //      | set OptGenericInstantiation
  //      | iset OptGenericInstantiation
  //      | multiset OptGenericInstantiation
  //      | seq OptGenericInstantiation
  //      | string
  //      | object
  //      | object_q
  //      | map  OptGenericInstantiation
  //      | imap  OptGenericInstantiation
  //      | arrayToken OptGenericInstantiation
  //      | arrayToken_q  OptGenericInstantiation
  //      | openparen (TypeAndToken (comma TypeAndToken)* )? closeparen
  //      | NameSegmentForTypeName (dot TypeNameOrCtorSuffix OptGenericInstantiation)*
  //  )
  //  ((waveArrow | doubleLineArrow | LineArrow ) TypeAndToken)?
  public static boolean TypeAndToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE_AND_TOKEN, "<type and token>");
    r = TypeAndToken_0(b, l + 1);
    r = r && TypeAndToken_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // bool
  //      | char
  //      | int
  //      | nattoken
  //      | real
  //      | ORDINAL
  //      | bvToken
  //      | set OptGenericInstantiation
  //      | iset OptGenericInstantiation
  //      | multiset OptGenericInstantiation
  //      | seq OptGenericInstantiation
  //      | string
  //      | object
  //      | object_q
  //      | map  OptGenericInstantiation
  //      | imap  OptGenericInstantiation
  //      | arrayToken OptGenericInstantiation
  //      | arrayToken_q  OptGenericInstantiation
  //      | openparen (TypeAndToken (comma TypeAndToken)* )? closeparen
  //      | NameSegmentForTypeName (dot TypeNameOrCtorSuffix OptGenericInstantiation)*
  private static boolean TypeAndToken_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, NATTOKEN);
    if (!r) r = consumeToken(b, REAL);
    if (!r) r = consumeToken(b, ORDINAL);
    if (!r) r = consumeToken(b, BVTOKEN);
    if (!r) r = TypeAndToken_0_7(b, l + 1);
    if (!r) r = TypeAndToken_0_8(b, l + 1);
    if (!r) r = TypeAndToken_0_9(b, l + 1);
    if (!r) r = TypeAndToken_0_10(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, OBJECT);
    if (!r) r = consumeToken(b, OBJECT_Q);
    if (!r) r = TypeAndToken_0_14(b, l + 1);
    if (!r) r = TypeAndToken_0_15(b, l + 1);
    if (!r) r = TypeAndToken_0_16(b, l + 1);
    if (!r) r = TypeAndToken_0_17(b, l + 1);
    if (!r) r = TypeAndToken_0_18(b, l + 1);
    if (!r) r = TypeAndToken_0_19(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // set OptGenericInstantiation
  private static boolean TypeAndToken_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // iset OptGenericInstantiation
  private static boolean TypeAndToken_0_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ISET);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // multiset OptGenericInstantiation
  private static boolean TypeAndToken_0_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULTISET);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // seq OptGenericInstantiation
  private static boolean TypeAndToken_0_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEQ);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // map  OptGenericInstantiation
  private static boolean TypeAndToken_0_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAP);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // imap  OptGenericInstantiation
  private static boolean TypeAndToken_0_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMAP);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arrayToken OptGenericInstantiation
  private static boolean TypeAndToken_0_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAYTOKEN);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arrayToken_q  OptGenericInstantiation
  private static boolean TypeAndToken_0_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAYTOKEN_Q);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // openparen (TypeAndToken (comma TypeAndToken)* )? closeparen
  private static boolean TypeAndToken_0_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && TypeAndToken_0_18_1(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TypeAndToken (comma TypeAndToken)* )?
  private static boolean TypeAndToken_0_18_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_18_1")) return false;
    TypeAndToken_0_18_1_0(b, l + 1);
    return true;
  }

  // TypeAndToken (comma TypeAndToken)*
  private static boolean TypeAndToken_0_18_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_18_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeAndToken(b, l + 1);
    r = r && TypeAndToken_0_18_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma TypeAndToken)*
  private static boolean TypeAndToken_0_18_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_18_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeAndToken_0_18_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeAndToken_0_18_1_0_1", c)) break;
    }
    return true;
  }

  // comma TypeAndToken
  private static boolean TypeAndToken_0_18_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_18_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NameSegmentForTypeName (dot TypeNameOrCtorSuffix OptGenericInstantiation)*
  private static boolean TypeAndToken_0_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameSegmentForTypeName(b, l + 1);
    r = r && TypeAndToken_0_19_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (dot TypeNameOrCtorSuffix OptGenericInstantiation)*
  private static boolean TypeAndToken_0_19_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_19_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeAndToken_0_19_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeAndToken_0_19_1", c)) break;
    }
    return true;
  }

  // dot TypeNameOrCtorSuffix OptGenericInstantiation
  private static boolean TypeAndToken_0_19_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_0_19_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && TypeNameOrCtorSuffix(b, l + 1);
    r = r && OptGenericInstantiation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((waveArrow | doubleLineArrow | LineArrow ) TypeAndToken)?
  private static boolean TypeAndToken_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_1")) return false;
    TypeAndToken_1_0(b, l + 1);
    return true;
  }

  // (waveArrow | doubleLineArrow | LineArrow ) TypeAndToken
  private static boolean TypeAndToken_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeAndToken_1_0_0(b, l + 1);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // waveArrow | doubleLineArrow | LineArrow
  private static boolean TypeAndToken_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAndToken_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, WAVEARROW);
    if (!r) r = consumeToken(b, DOUBLELINEARROW);
    if (!r) r = consumeToken(b, LINEARROW);
    return r;
  }

  /* ********************************************************** */
  // (ghost)? (
  //     TypeAndToken (colon TypeAndToken)?
  //     | digits colon TypeAndToken
  //  )
  public static boolean TypeIdentOptional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_IDENT_OPTIONAL, "<type ident optional>");
    r = TypeIdentOptional_0(b, l + 1);
    r = r && TypeIdentOptional_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ghost)?
  private static boolean TypeIdentOptional_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_0")) return false;
    consumeToken(b, GHOST);
    return true;
  }

  // TypeAndToken (colon TypeAndToken)?
  //     | digits colon TypeAndToken
  private static boolean TypeIdentOptional_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeIdentOptional_1_0(b, l + 1);
    if (!r) r = TypeIdentOptional_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeAndToken (colon TypeAndToken)?
  private static boolean TypeIdentOptional_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeAndToken(b, l + 1);
    r = r && TypeIdentOptional_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (colon TypeAndToken)?
  private static boolean TypeIdentOptional_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_1_0_1")) return false;
    TypeIdentOptional_1_0_1_0(b, l + 1);
    return true;
  }

  // colon TypeAndToken
  private static boolean TypeIdentOptional_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // digits colon TypeAndToken
  private static boolean TypeIdentOptional_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdentOptional_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DIGITS, COLON);
    r = r && TypeAndToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identdef | digits
  public static boolean TypeNameOrCtorSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeNameOrCtorSuffix")) return false;
    if (!nextTokenIs(b, "<type name or ctor suffix>", DIGITS, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME_OR_CTOR_SUFFIX, "<type name or ctor suffix>");
    r = consumeToken(b, IDENTDEF);
    if (!r) r = consumeToken(b, DIGITS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // openparen TPCharOption (comma TPCharOption)* closeparen
  public static boolean TypeParameterCharacteristics(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterCharacteristics")) return false;
    if (!nextTokenIs(b, OPENPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENPAREN);
    r = r && TPCharOption(b, l + 1);
    r = r && TypeParameterCharacteristics_2(b, l + 1);
    r = r && consumeToken(b, CLOSEPAREN);
    exit_section_(b, m, TYPE_PARAMETER_CHARACTERISTICS, r);
    return r;
  }

  // (comma TPCharOption)*
  private static boolean TypeParameterCharacteristics_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterCharacteristics_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeParameterCharacteristics_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeParameterCharacteristics_2", c)) break;
    }
    return true;
  }

  // comma TPCharOption
  private static boolean TypeParameterCharacteristics_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterCharacteristics_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TPCharOption(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // minus UnaryExpression
  //      | NegOp UnaryExpression
  //      | map MapDisplayExpr (Suffix)*
  //      | imap MapDisplayExpr (Suffix)*
  //      | iset ISetDisplayExpr (Suffix)*
  //      | LambdaExpression
  //      | EndlessExpression
  //      | NameSegment (Suffix)*
  //      | DisplayExpr (Suffix)*
  //      | MultiSetExpr (Suffix)*
  //      | ConstAtomExpression (Suffix)*
  public static boolean UnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = UnaryExpression_0(b, l + 1);
    if (!r) r = UnaryExpression_1(b, l + 1);
    if (!r) r = UnaryExpression_2(b, l + 1);
    if (!r) r = UnaryExpression_3(b, l + 1);
    if (!r) r = UnaryExpression_4(b, l + 1);
    if (!r) r = LambdaExpression(b, l + 1);
    if (!r) r = EndlessExpression(b, l + 1);
    if (!r) r = UnaryExpression_7(b, l + 1);
    if (!r) r = UnaryExpression_8(b, l + 1);
    if (!r) r = UnaryExpression_9(b, l + 1);
    if (!r) r = UnaryExpression_10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // minus UnaryExpression
  private static boolean UnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NegOp UnaryExpression
  private static boolean UnaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NegOp(b, l + 1);
    r = r && UnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // map MapDisplayExpr (Suffix)*
  private static boolean UnaryExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAP);
    r = r && MapDisplayExpr(b, l + 1);
    r = r && UnaryExpression_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean UnaryExpression_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_2_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryExpression_2_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_2_2", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean UnaryExpression_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // imap MapDisplayExpr (Suffix)*
  private static boolean UnaryExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMAP);
    r = r && MapDisplayExpr(b, l + 1);
    r = r && UnaryExpression_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean UnaryExpression_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_3_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryExpression_3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_3_2", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean UnaryExpression_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // iset ISetDisplayExpr (Suffix)*
  private static boolean UnaryExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ISET);
    r = r && ISetDisplayExpr(b, l + 1);
    r = r && UnaryExpression_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean UnaryExpression_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_4_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryExpression_4_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_4_2", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean UnaryExpression_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NameSegment (Suffix)*
  private static boolean UnaryExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NameSegment(b, l + 1);
    r = r && UnaryExpression_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean UnaryExpression_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_7_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryExpression_7_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_7_1", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean UnaryExpression_7_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_7_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DisplayExpr (Suffix)*
  private static boolean UnaryExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DisplayExpr(b, l + 1);
    r = r && UnaryExpression_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean UnaryExpression_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_8_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryExpression_8_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_8_1", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean UnaryExpression_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_8_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MultiSetExpr (Suffix)*
  private static boolean UnaryExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MultiSetExpr(b, l + 1);
    r = r && UnaryExpression_9_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean UnaryExpression_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_9_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryExpression_9_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_9_1", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean UnaryExpression_9_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_9_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ConstAtomExpression (Suffix)*
  private static boolean UnaryExpression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ConstAtomExpression(b, l + 1);
    r = r && UnaryExpression_10_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Suffix)*
  private static boolean UnaryExpression_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_10_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnaryExpression_10_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpression_10_1", c)) break;
    }
    return true;
  }

  // (Suffix)
  private static boolean UnaryExpression_10_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpression_10_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Lhs
  //  (
  //      (Attribute)* semi
  //      | (comma Lhs)* (
  //         gets Rhs (comma Rhs)*
  //         | boredSmiley (assume)? Expression
  //       )semi
  //      | colon
  //  )
  public static boolean UpdateStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPDATE_STMT, "<update stmt>");
    r = Lhs(b, l + 1);
    r = r && UpdateStmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (Attribute)* semi
  //      | (comma Lhs)* (
  //         gets Rhs (comma Rhs)*
  //         | boredSmiley (assume)? Expression
  //       )semi
  //      | colon
  private static boolean UpdateStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpdateStmt_1_0(b, l + 1);
    if (!r) r = UpdateStmt_1_1(b, l + 1);
    if (!r) r = consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)* semi
  private static boolean UpdateStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpdateStmt_1_0_0(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean UpdateStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UpdateStmt_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UpdateStmt_1_0_0", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean UpdateStmt_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Lhs)* (
  //         gets Rhs (comma Rhs)*
  //         | boredSmiley (assume)? Expression
  //       )semi
  private static boolean UpdateStmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpdateStmt_1_1_0(b, l + 1);
    r = r && UpdateStmt_1_1_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Lhs)*
  private static boolean UpdateStmt_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UpdateStmt_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UpdateStmt_1_1_0", c)) break;
    }
    return true;
  }

  // comma Lhs
  private static boolean UpdateStmt_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Lhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // gets Rhs (comma Rhs)*
  //         | boredSmiley (assume)? Expression
  private static boolean UpdateStmt_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UpdateStmt_1_1_1_0(b, l + 1);
    if (!r) r = UpdateStmt_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // gets Rhs (comma Rhs)*
  private static boolean UpdateStmt_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETS);
    r = r && Rhs(b, l + 1);
    r = r && UpdateStmt_1_1_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Rhs)*
  private static boolean UpdateStmt_1_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UpdateStmt_1_1_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UpdateStmt_1_1_1_0_2", c)) break;
    }
    return true;
  }

  // comma Rhs
  private static boolean UpdateStmt_1_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // boredSmiley (assume)? Expression
  private static boolean UpdateStmt_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BOREDSMILEY);
    r = r && UpdateStmt_1_1_1_1_1(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (assume)?
  private static boolean UpdateStmt_1_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UpdateStmt_1_1_1_1_1")) return false;
    consumeToken(b, ASSUME);
    return true;
  }

  /* ********************************************************** */
  // (ghost)? var
  //  (
  //      (Attribute)* LocalIdentTypeOptional (comma (Attribute)* LocalIdentTypeOptional)*
  //      (
  //          gets Rhs (comma Rhs)* | (Attribute)* boredSmiley (assume)? Expression
  //      )?
  //      semi
  //      |
  //      CasePatternLocal (gets |(Attribute)* boredSmiley) Expression semi
  //  )
  public static boolean VarDeclStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement")) return false;
    if (!nextTokenIs(b, "<var decl statement>", GHOST, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_DECL_STATEMENT, "<var decl statement>");
    r = VarDeclStatement_0(b, l + 1);
    r = r && consumeToken(b, VAR);
    r = r && VarDeclStatement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ghost)?
  private static boolean VarDeclStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_0")) return false;
    consumeToken(b, GHOST);
    return true;
  }

  // (Attribute)* LocalIdentTypeOptional (comma (Attribute)* LocalIdentTypeOptional)*
  //      (
  //          gets Rhs (comma Rhs)* | (Attribute)* boredSmiley (assume)? Expression
  //      )?
  //      semi
  //      |
  //      CasePatternLocal (gets |(Attribute)* boredSmiley) Expression semi
  private static boolean VarDeclStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarDeclStatement_2_0(b, l + 1);
    if (!r) r = VarDeclStatement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)* LocalIdentTypeOptional (comma (Attribute)* LocalIdentTypeOptional)*
  //      (
  //          gets Rhs (comma Rhs)* | (Attribute)* boredSmiley (assume)? Expression
  //      )?
  //      semi
  private static boolean VarDeclStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarDeclStatement_2_0_0(b, l + 1);
    r = r && LocalIdentTypeOptional(b, l + 1);
    r = r && VarDeclStatement_2_0_2(b, l + 1);
    r = r && VarDeclStatement_2_0_3(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean VarDeclStatement_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarDeclStatement_2_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarDeclStatement_2_0_0", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean VarDeclStatement_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma (Attribute)* LocalIdentTypeOptional)*
  private static boolean VarDeclStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarDeclStatement_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarDeclStatement_2_0_2", c)) break;
    }
    return true;
  }

  // comma (Attribute)* LocalIdentTypeOptional
  private static boolean VarDeclStatement_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && VarDeclStatement_2_0_2_0_1(b, l + 1);
    r = r && LocalIdentTypeOptional(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean VarDeclStatement_2_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarDeclStatement_2_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarDeclStatement_2_0_2_0_1", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean VarDeclStatement_2_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //          gets Rhs (comma Rhs)* | (Attribute)* boredSmiley (assume)? Expression
  //      )?
  private static boolean VarDeclStatement_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3")) return false;
    VarDeclStatement_2_0_3_0(b, l + 1);
    return true;
  }

  // gets Rhs (comma Rhs)* | (Attribute)* boredSmiley (assume)? Expression
  private static boolean VarDeclStatement_2_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarDeclStatement_2_0_3_0_0(b, l + 1);
    if (!r) r = VarDeclStatement_2_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // gets Rhs (comma Rhs)*
  private static boolean VarDeclStatement_2_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETS);
    r = r && Rhs(b, l + 1);
    r = r && VarDeclStatement_2_0_3_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (comma Rhs)*
  private static boolean VarDeclStatement_2_0_3_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarDeclStatement_2_0_3_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarDeclStatement_2_0_3_0_0_2", c)) break;
    }
    return true;
  }

  // comma Rhs
  private static boolean VarDeclStatement_2_0_3_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)* boredSmiley (assume)? Expression
  private static boolean VarDeclStatement_2_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarDeclStatement_2_0_3_0_1_0(b, l + 1);
    r = r && consumeToken(b, BOREDSMILEY);
    r = r && VarDeclStatement_2_0_3_0_1_2(b, l + 1);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean VarDeclStatement_2_0_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarDeclStatement_2_0_3_0_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarDeclStatement_2_0_3_0_1_0", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean VarDeclStatement_2_0_3_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (assume)?
  private static boolean VarDeclStatement_2_0_3_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_0_3_0_1_2")) return false;
    consumeToken(b, ASSUME);
    return true;
  }

  // CasePatternLocal (gets |(Attribute)* boredSmiley) Expression semi
  private static boolean VarDeclStatement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CasePatternLocal(b, l + 1);
    r = r && VarDeclStatement_2_1_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // gets |(Attribute)* boredSmiley
  private static boolean VarDeclStatement_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GETS);
    if (!r) r = VarDeclStatement_2_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)* boredSmiley
  private static boolean VarDeclStatement_2_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VarDeclStatement_2_1_1_1_0(b, l + 1);
    r = r && consumeToken(b, BOREDSMILEY);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Attribute)*
  private static boolean VarDeclStatement_2_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_1_1_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VarDeclStatement_2_1_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VarDeclStatement_2_1_1_1_0", c)) break;
    }
    return true;
  }

  // (Attribute)
  private static boolean VarDeclStatement_2_1_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclStatement_2_1_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // star | plus | excMark | minus
  public static boolean Variance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Variance")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIANCE, "<variance>");
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, EXCMARK);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // while
  //  (
  //      (LoopSpec)* AlternativeBlock
  //      |
  //      (Guard | ellipsis)(LoopSpec)* (BlockStmt | ellipsis|)
  //  )
  public static boolean WhileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && WhileStmt_1(b, l + 1);
    exit_section_(b, m, WHILE_STMT, r);
    return r;
  }

  // (LoopSpec)* AlternativeBlock
  //      |
  //      (Guard | ellipsis)(LoopSpec)* (BlockStmt | ellipsis|)
  private static boolean WhileStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStmt_1_0(b, l + 1);
    if (!r) r = WhileStmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LoopSpec)* AlternativeBlock
  private static boolean WhileStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStmt_1_0_0(b, l + 1);
    r = r && AlternativeBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LoopSpec)*
  private static boolean WhileStmt_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileStmt_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStmt_1_0_0", c)) break;
    }
    return true;
  }

  // (LoopSpec)
  private static boolean WhileStmt_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LoopSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Guard | ellipsis)(LoopSpec)* (BlockStmt | ellipsis|)
  private static boolean WhileStmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WhileStmt_1_1_0(b, l + 1);
    r = r && WhileStmt_1_1_1(b, l + 1);
    r = r && WhileStmt_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Guard | ellipsis
  private static boolean WhileStmt_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_1_0")) return false;
    boolean r;
    r = Guard(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    return r;
  }

  // (LoopSpec)*
  private static boolean WhileStmt_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WhileStmt_1_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileStmt_1_1_1", c)) break;
    }
    return true;
  }

  // (LoopSpec)
  private static boolean WhileStmt_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LoopSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BlockStmt | ellipsis|
  private static boolean WhileStmt_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockStmt(b, l + 1);
    if (!r) r = consumeToken(b, ELLIPSIS);
    if (!r) r = consumeToken(b, WHILESTMT_1_1_2_2_0);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identdef
  public static boolean WildIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WildIdent")) return false;
    if (!nextTokenIs(b, IDENTDEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTDEF);
    exit_section_(b, m, WILD_IDENT, r);
    return r;
  }

}
