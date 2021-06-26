# Architecture Decision Record: Object Relation Mapper

## Summary
### Issue

### Decision

### Status

---

## Details

### Constraints 
- アーキテクチャーはleyered architecture
- 学習コスト低め
- MySQLのdriverがある

### Options
- JDBC data
- JOOQ
- hibernate
- JPA data

### Memo
レイヤー分かれてるので、SQLに近い形でもいい気がする  
#### 意思決定のフロー
1. JDBC Data 試してみる  
2. 物足りなければJOOQ
3. 物足りなければ他を探す
4. どうしてもなければJPA

### Reference