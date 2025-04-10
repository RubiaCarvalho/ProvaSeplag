package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class GxFullTextSearchReindexer
{
   public static int Reindex( int remoteHandle )
   {
      GxSilentTrnSdt obj;
      IGxSilentTrn trn;
      boolean result;
      obj = new com.treinamento2.Sdtlotacao(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.treinamento2.Sdtservidor_efetivo(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.treinamento2.Sdtservidor_temporario(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.treinamento2.SdtUnidade(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      obj = new com.treinamento2.SdtServLotado(remoteHandle);
      trn = obj.getTransaction() ;
      result = trn.Reindex() ;
      return 1 ;
   }

}

