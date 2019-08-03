package br.edu.ufabc.leocaliza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Branch;
import br.edu.ufabc.leocaliza.repository.BranchRepository;

@Service
public class BranchService {
  @Autowired
  BranchRepository branchRepository;

  public Branch save(Branch branch) {
    return branchRepository.save(branch);
  }

}
