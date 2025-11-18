package com.example.parcialtp3_2.infraestructure

class UserRepository(private val db: AppDatabase) {
    private val dao = db.userDao()

    fun observeUsers() = dao.getAllFlow()

    suspend fun getLocalUsers(): List<UserEntity> = dao.getAll()

    suspend fun persistUsers(users: List<UserEntity>) {
        dao.insertAll(users)
    }

    suspend fun clear() = dao.clear()
}