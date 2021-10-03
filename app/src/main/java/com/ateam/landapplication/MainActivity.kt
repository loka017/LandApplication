package com.ateam.landapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.ateam.landapplication.adapters.RoomAdapter
import com.ateam.landapplication.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(Room(7500,"서울시 동대문구", 8, "서울시 동대문구 8층 7500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 서대문구 8층 2억 4500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 동대문구 5층 1억 4500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 은평구 7층 3억 4500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 서대문구 8층 2억 4500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 서대문구 8층 2억 4500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 서대문구 8층 2억 4500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 서대문구 8층 2억 4500만원 방입니다."))
        mRoomList.add(Room(24500,"서울시 동대문구", 0, "서울시 서대문구 8층 2억 4500만원 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

    }
}