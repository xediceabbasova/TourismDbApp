package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.TourismDaoInter;
import com.company.entity.Tourism;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TourismDaoImpl extends AbstractDao implements TourismDaoInter {

    public Tourism getTourism(ResultSet rs) throws Exception {

        int id = rs.getInt("id");
        String customerName = rs.getString("customer_name");
        String customerSurname = rs.getString("customer_surname");
        String gender = rs.getString("gender");
        int age = rs.getInt("age");
        int passportId = rs.getInt("passport_id");
        int ticketId = rs.getInt("ticket_id");
        double ticketPrice = rs.getDouble("ticket_price");
        String fromDestination = rs.getString("from_destination");
        String toDestination = rs.getString("to_destination");

        Tourism t = new Tourism(id, customerName, customerSurname, gender, age, passportId, ticketId, ticketPrice, fromDestination, toDestination);
        return t;
    }

    @Override
    public List<Tourism> getAll() {

        List<Tourism> result = new ArrayList<>();

        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from tourism_table;");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Tourism t = getTourism(rs);
                result.add(t);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public Tourism getById(int id) {

        Tourism t = null;
        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from tourism_table where id= " + id);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                t = getTourism(rs);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return t;
    }

    @Override
    public boolean addTourism(Tourism t) {

        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into tourism_table(customer_name, customer_surname, gender, age, passport_id, ticket_id, ticket_price, from_destination, to_destination) values(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, t.getCustomerName());
            stmt.setString(2, t.getCustomerSurname());
            stmt.setString(3, t.getGender());
            stmt.setInt(4, t.getAge());
            stmt.setInt(5, t.getPassportId());
            stmt.setInt(6, t.getTicketId());
            stmt.setDouble(7, t.getTicketPrice());
            stmt.setString(8, t.getFromDestination());
            stmt.setString(9, t.getToDestination());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateTourism(Tourism t) {

        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update tourism_table set customer_name=?, customer_surname=?, gender=?, age=?, passport_id=?, ticket_id=?, ticket_price=?, from_destination=?, to_destination=? where id=?");
            stmt.setString(1, t.getCustomerName());
            stmt.setString(2, t.getCustomerSurname());
            stmt.setString(3, t.getGender());
            stmt.setInt(4, t.getAge());
            stmt.setInt(5, t.getPassportId());
            stmt.setInt(6, t.getTicketId());
            stmt.setDouble(7, t.getTicketPrice());
            stmt.setString(8, t.getFromDestination());
            stmt.setString(9, t.getToDestination());
            stmt.setInt(10, t.getId());
            return stmt.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeTourism(int id) {

        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("delete from tourism_table where id= " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
